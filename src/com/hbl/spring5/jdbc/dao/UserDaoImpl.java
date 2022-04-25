package com.hbl.spring5.jdbc.dao;

import com.hbl.spring5.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    /*注入JdbcTemplate*/
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(User user) {
        /*创建sql语句*/
        String sql = "insert into t_user values(?,?,?)";
        Object[] args = {user.getUserId(),user.getUserName(),user.getPassword()};

        int add = jdbcTemplate.update(sql,args);
        System.out.println(add);
    }

    @Override
    public void update(User user) {
        /*创建sql语句*/
        String sql = "update t_user set username= ? where id=?";
        Object[] args = {user.getUserName(),user.getUserId()};

        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void delete(User user) {
        /*创建sql语句*/
        String sql = "delete from t_user where id= ?";
        Object[] args = {user.getUserId()};

        int delete = jdbcTemplate.update(sql,args);
        System.out.println(delete);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_user";
        int count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    @Override
    public User getUser(int id) {
        String sql = "Select * from t_user where id=?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),id);
        return user;
    }

    @Override
    public List<User> getUsers() {
        String sql = "select * from t_user";
        List<User> users = jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_user values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_user set username= ? where id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_user where id= ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }


}
