package com.dengchao.service.impl;

import com.dengchao.dao.AccountDao;
import com.dengchao.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;


    /**
     * 注入事务管理的模板
     */
    private TransactionTemplate transactionTemplate;

    //需要set方法，才能注入
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //需要set方法，才能注入
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void transfer(final String out, final String in, final Double money) {
        /**
         * 在这里面进行事务操作
         * 因为需要在匿名内部类中使用参数，所以给参数加上final关键字
         */
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {

            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(out, money);

                accountDao.inMoney(in, money);
            }
        });

    }
}
