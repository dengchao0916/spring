package com.dengchao.service.impl;

import com.dengchao.dao.AccountDao;
import com.dengchao.entity.Account;
import com.dengchao.service.AccountService;

import java.util.List;


public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> getAllAccount() {
        return accountDao.getAllAccount();
    }

    @Override
    public Account getAccountById(int id) {
        return accountDao.getAccountById(id);
    }

    @Override
    public int removeById(int id) {
        return accountDao.removeById(id);
    }

    @Override
    public int update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }
}
