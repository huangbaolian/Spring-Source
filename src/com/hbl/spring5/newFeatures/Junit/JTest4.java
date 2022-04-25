package com.hbl.spring5.newFeatures.Junit;


import com.hbl.spring5.transaction.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*整合JUnit4*/
@RunWith(SpringJUnit4ClassRunner.class)//单元测试版本
@ContextConfiguration("classpath:transactionConfig.xml")//加载配置文件
public class JTest4 {
    @Autowired
    private AccountService accountService;

    @Test
    public void  test1(){
        accountService.accountMoney();
    }

}
