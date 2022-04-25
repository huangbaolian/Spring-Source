package com.hbl.spring5.jdbc.dao;

import com.hbl.spring5.jdbc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {
    /*添加方法*/
    void add(User user);

    void update(User user);

    void delete(User user);

    int selectCount();

    User getUser(int id);

    List<User> getUsers();

    void batchAdd(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
