package com.dengchao.service.impl;

import com.dengchao.dao.AccountDao;
import com.dengchao.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    // 需要set方法，才能注入
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(final String out, final String in, final Double money) {

        accountDao.outMoney(out, money);

        accountDao.inMoney(in, money);
    }

}