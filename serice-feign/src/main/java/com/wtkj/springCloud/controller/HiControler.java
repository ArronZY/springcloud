package com.wtkj.springCloud.controller;

import com.wtkj.service.SchedualServiceHi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wtkj_jxb_07 on 2019/12/20.
 */
@RestController
@Api(tags = "测试相关接口")
public class HiControler {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET", value = "你好，springCloud-fegin", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
