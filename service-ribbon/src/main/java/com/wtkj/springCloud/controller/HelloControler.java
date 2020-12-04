package com.wtkj.springCloud.controller;

import com.wtkj.springCloud.po.XtUser;
import com.wtkj.springCloud.services.HelloService;
import com.wtkj.springCloud.services.UserService;
import com.wtkj.springCloud.utils.ControllerResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wtkj_jxb_07 on 2019/12/20.
 */
@RestController
@Api(tags = "测试相关接口")
public class HelloControler {
    @Autowired
    HelloService helloService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET", value = "你好，springCloud", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hi(@ApiParam(name = "name", value = "姓名")
            @RequestParam String name)
    {
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/selectAllXtUser", method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET", value = "查询所有用户信息", produces = MediaType.APPLICATION_JSON_VALUE)
    public String index() {
        long beginTime=System.currentTimeMillis();
        XtUser  user = userService.selectByPrimaryKey("178BF353CD0F4EF9AD8671ED7DAEA727");
        List<XtUser> xtUsers = userService.selectAllList();
        long time=System.currentTimeMillis()-beginTime;
        return "用户名:"+user.getUsername()+"---登录名:"+user.getLoginname()+xtUsers.toString()+",消耗查询时间："+time;

    }

    @RequestMapping(value = "/selectXtUserById", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(httpMethod = "GET", value = "根据ID查询用户信息", produces = MediaType.APPLICATION_JSON_VALUE)
    public ControllerResult selectGljsPersonalCredit(@ApiParam(name = "id", value = "用户ID")
                                                     @RequestParam(value = "id", required = false) String id) {
//        List<XtUser> xtUsers = userService.selectAllList();
        XtUser  user = userService.selectByPrimaryKey(id);
        return ControllerResult.success(user);
    }
}
