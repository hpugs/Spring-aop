package com.hpugs.spring.one.interception;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Description Spring annotation 切面注入
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月13日 下午4:20:15
 */
public class TimeIntercepation {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	
	public void before(){
		System.out.println("执行开始时间：" + sdf.format(new Date()));
	}
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around 执行前");
		Object result = pjp.proceed();//获得方法执行后的返回参数
		System.out.println("around 执行后");
	    return result;
	}
	
	public void after(){
		System.out.println("执行开始时间：" + sdf.format(new Date()));
	}
	
	public void afterReturning(){
		System.out.println("方法正常执行完毕");
	}
	
	public void throwing(){
		System.out.println("方法执行出现异常");
	}
	
}
