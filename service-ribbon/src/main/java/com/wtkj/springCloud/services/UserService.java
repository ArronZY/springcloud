package com.wtkj.springCloud.services;

import com.wtkj.springCloud.mapper.XtUserMapper;
import com.wtkj.springCloud.po.XtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wtkj_jxb_07 on 2019/12/23.
 */
@Service
public class UserService {
    @Autowired
    private XtUserMapper xtUserMapper;

//    @Cacheable(value="XtUser", key="'user'")
    public XtUser selectByPrimaryKey(String id) {
        System.out.println("开始查询.....");
        try {
            Thread.sleep(3 * 1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("查询结束......");
        XtUser user=xtUserMapper.selectByPrimaryKey(id);

        return user;
    }

    @Cacheable(value="XtUser", key="'userList'")
    public List<XtUser> selectAllList() {
        System.out.println("开始查询.....");
        try {
            Thread.sleep(3 * 1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("查询结束......");
        List<XtUser> user=xtUserMapper.selectAllList();

        return user;
    }
}
