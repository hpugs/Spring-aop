package com.hpugs.spring.one.dao;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月13日 上午9:53:04
 */
public class UserDaoImpl implements IUserDao {

	@Override
	public boolean add() {
		System.out.println("dao操作成功");
		return false;
	}

}
