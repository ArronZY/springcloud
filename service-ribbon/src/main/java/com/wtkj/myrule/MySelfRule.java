package com.wtkj.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wtkj_jxb_07 on 2020/11/23.
 */
@Configuration
public class MySelfRule {
    /**
     *  没有显式的声明，则用默认的轮询算法，
     *  如果有显式的声明，则按照声明的使用。
     * @return
     */
    @Bean
    public IRule getRandomRule(){
//        return new RoundRobinRule();   // 默认的轮询 算法。
        return new RandomRule();         // 随机算法
    }
}
