package com.wtkj.service.impl;

import com.wtkj.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by wtkj_jxb_07 on 2020/11/20.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "已经崩溃，无法访问！ "+name;
    }
}
