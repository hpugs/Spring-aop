package com.hpugs.text;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hpugs.spring.one.action.UserAction;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2018年1月18日 下午2:08:04
 */
public class aopTest {
	
	@Test
	public void addTest(){
		//注入Spring Bean
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取UserAction对象
		UserAction userAction = (UserAction) applicationContext.getBean("userAction");
		//都有添加操作
		userAction.add();
	}

}
