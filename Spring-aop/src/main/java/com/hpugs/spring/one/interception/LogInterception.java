package com.hpugs.spring.one.interception;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description JDK InvocationHandler
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月13日 下午2:08:17
 */
public class LogInterception implements InvocationHandler {
	
	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}

	private void beforeMethod(){
		System.out.println("切面添加日志开始");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		beforeMethod();
		Object result = method.invoke(target, args);
		afterMethod();
		return result;
	}
	
	private void afterMethod(){
		System.out.println("切面添加日志结束");
	}

}
