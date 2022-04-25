package com.hbl.spring5.jdbc.service;

import com.hbl.spring5.jdbc.dao.UserDao;
import com.hbl.spring5.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class UserService {
    /*注入dao*/
    @Autowired
    private UserDao userDao;

    /*添加方法*/
    public void addUser(User user){
        userDao.add(user);
    }



    /*修改方法*/
   public void updateUser(User user){
       userDao.update(user);
   }

    /*删除方法*/
    public void deleteUser(User user){
        userDao.delete(user);
    }

    /*查询操作-返回某个值*/
    public int findCount(){
        return userDao.selectCount();
    }
    /*查询操作-返回某个对象*/
    public User findUserInfo(int id){
        return userDao.getUser(id);
    }
    /*查询操作-返回集合*/

    public List<User> findUsers(){
        return userDao.getUsers();
    }


    /*批量添加*/

    public void batchAdd(List<Object[]> batchArgs){
         userDao.batchAdd(batchArgs);
    }

    /*批量修改*/
    public void batchUpdate(List<Object[]> batchArgs){
        userDao.batchUpdate(batchArgs);
    }
    /*批量删除*/
    public void batchDelete(List<Object[]> batchArgs){
        userDao.batchDelete(batchArgs);
    }
}
