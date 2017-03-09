package com.wheezy.blogmvc.repository.template;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;


@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/appContext.xml"})
@TransactionConfiguration(transactionManager="transactionManager",
		defaultRollback = true)
public class ITRepositoryTestTemplate {

}