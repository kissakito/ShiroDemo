package test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:spring/applicationContext-mybatis.xml","classpath:spring/applicationContext-transaction.xml","classpath:spring/applicationContext.xml"})  
public class BaseTest2 {
	
}
