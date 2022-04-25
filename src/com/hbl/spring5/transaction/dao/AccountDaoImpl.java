package com.hbl.spring5.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl  implements  AccountDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    //lucy转账100给mary
    @Override
    public void addMoney() {
      String sql = "update t_account set money=money-? where username=?";
      jdbcTemplate.update(sql,100,"lucy");
    }
    //mary 入账100
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mary");
    }
}
