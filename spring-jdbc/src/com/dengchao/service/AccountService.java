package com.dengchao.service;

import com.dengchao.entity.Account;

import java.util.List;

public interface AccountService {

    public List<Account> getAllAccount();

    public Account getAccountById(int id);

    public int removeById(int id);

    public int update(Account account);

    public int add(Account account);
}
