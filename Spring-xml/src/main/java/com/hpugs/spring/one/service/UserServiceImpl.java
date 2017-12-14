package com.hpugs.spring.one.service;

import com.hpugs.spring.one.dao.IUserDao;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月13日 上午9:54:07
 */
public class UserServiceImpl implements IUserService {
	
	private IUserDao userDao;

	@Override
	public boolean add() {
		System.out.println("service添加操作开始");
		userDao.add();
		System.out.println("service添加操作结束");
		return false;
	}
	
	@Override
	public void delete() {
		System.out.println("service删除操作开始");
		userDao.delete();
		System.out.println("service删除操作结束");
	}
	
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	
}
