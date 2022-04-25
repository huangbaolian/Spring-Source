package com.hbl.spring5.transaction.service;


import com.hbl.spring5.transaction.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.REPEATABLE_READ,timeout = 10)
public class AccountService {

    @Autowired
    AccountDao accountDao;

    //转账方法
    public void accountMoney(){
       // try {
            //第一步 开启事务（编程式事务管理）

            //第二步进行业务操作（编程式事务管理）

            accountDao.addMoney();
            int i  = 100/0;
            accountDao.reduceMoney();

            //第三步 没有异常，提交事务（编程式事务管理）
       // }catch (Exception e){
            //出现异常，事务回滚（编程式事务管理）
       // }


    }
}
