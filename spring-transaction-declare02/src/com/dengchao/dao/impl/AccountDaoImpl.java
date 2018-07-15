package com.dengchao.dao.impl;

import com.dengchao.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void outMoney(String out, Double money) {
        String sql = "UPDATE account SET money =  money - ? WHERE name = ?";
        this.getJdbcTemplate().update(sql, money, out);

    }

    @Override
    public void inMoney(String in, Double money) {
        String sql = "UPDATE account SET money =  money + ? WHERE name = ?";
        this.getJdbcTemplate().update(sql, money, in);

    }
}