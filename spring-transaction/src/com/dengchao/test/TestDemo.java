package com.dengchao.test;

import com.dengchao.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TestDemo {
    @Resource(name="accountService")//得到bean id为accountService的对象
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("aaa", "bbb", 200d);
    }
}
