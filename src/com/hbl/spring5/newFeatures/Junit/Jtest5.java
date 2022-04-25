package com.hbl.spring5.newFeatures.Junit;

import com.hbl.spring5.transaction.service.AccountService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/*@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:transactionConfig.xml")//加载配置文件*/
@SpringJUnitConfig(locations = "classpath:transactionConfig.xml")//复合注解可以替代上面两个注解
public class Jtest5 {
    @Autowired
    private AccountService accountService;

    @Test
    public void  test1(){
        accountService.accountMoney();
    }

}
