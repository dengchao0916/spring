package com.dengchao.dao.impl;

import com.dengchao.dao.AccountDao;
import com.dengchao.entity.Account;
import com.dengchao.entity.AccountRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Account> getAllAccount() {
        String sql = "SELECT * FROM account";
        return this.jdbcTemplate.query(sql, new AccountRowMapper());
    }

    @Override
    public Account getAccountById(int id) {
        String sql = "SELECT * FROM account WHERE id = ?";
        return (Account) this.jdbcTemplate.queryForObject(sql, new Object[]{id}, new AccountRowMapper());
    }

    @Override
    public int removeById(int id) {
        String sql = "DELETE FROM account WHERE id = ?";
        return this.jdbcTemplate.update(sql, id);
    }

    @Override
    public int update(Account account) {
        String sql = "UPDATE account SET money = ? WHERE id = ?";
        return this.jdbcTemplate.update(sql, account.getMoney(), account.getId());
    }

    @Override
    public int add(Account account) {
        String sql = "INSERT INTO account (name,money) VALUES(?,?)";
        return this.jdbcTemplate.update(sql, account.getName(), account.getMoney());
    }
}
