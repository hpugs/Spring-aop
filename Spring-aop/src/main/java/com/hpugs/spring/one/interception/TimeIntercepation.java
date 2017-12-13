package com.hpugs.spring.one.interception;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Description Spring annotation 切面注入
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月13日 下午4:20:15
 */
@Aspect
public class TimeIntercepation {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Before("execution(* com.hpugs.spring.one.service.*.*())")
	public void before(){
		System.out.println("执行开始时间：" + sdf.format(new Date()));
	}
	
	@After("execution(* com.hpugs.spring.one.service.*.*())")
	public void after(){
		System.out.println("执行开始时间：" + sdf.format(new Date()));
	}
	
}
