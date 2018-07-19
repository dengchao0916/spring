package com.dengchao.test;

import com.dengchao.entity.Account;
import com.dengchao.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TestDemo {
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo() {
        Account account  = new Account();
        account.setId(5);
        account.setName("dengchao");
        account.setMoney(3000000d);
        System.out.println(accountService.getAllAccount());
    }

}
