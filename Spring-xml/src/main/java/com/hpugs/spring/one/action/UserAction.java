package com.hpugs.spring.one.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.alibaba.fastjson.JSONObject;
import com.hpugs.spring.one.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Description 用户Action管理
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月13日 上午9:54:47
 */
public class UserAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{
	
	private IUserService userService;
	
	private HttpServletRequest request;
	private HttpSession session;
	private HttpServletResponse response;
	
	/**
	 * @Description 添加用户测试
	 * @throws IOException
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2017年12月13日 上午10:56:30
	 */
	public void add(){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("status", 1);
		result.put("msg", "操作成功");
		
		System.out.println("action操作开始");
		
		boolean flag = userService.add();
		result.put("data", flag);
		
		System.out.println("action操作结束");
		
		//输出到客户端
		PrintWriter writer = null;
		try {
			if(null != response){
				response.setContentType("text/html;charset=UTF-8");// 解决中文乱码
				response.setCharacterEncoding("UTF-8");
				writer = response.getWriter();
				writer.write(JSONObject.toJSONString(result));
			}else{
				System.out.println(JSONObject.toJSONString(result));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != writer){
				writer.flush();
				writer.close();
			}
		}
	}
	
	/**
	 * @Description 删除用户测试
	 * @throws IOException
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2017年12月13日 上午10:56:30
	 */
	public void delete(){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("status", 1);
		result.put("msg", "操作成功");
		
		System.out.println("action操作开始");
		
		userService.delete();
		result.put("data", true);
		
		System.out.println("action操作结束");
		
		//输出到客户端
		PrintWriter writer = null;
		try {
			if(null != response){
				response.setContentType("text/html;charset=UTF-8");// 解决中文乱码
				response.setCharacterEncoding("UTF-8");
				writer = response.getWriter();
				writer.write(JSONObject.toJSONString(result));
			}else{
				System.out.println(JSONObject.toJSONString(result));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != writer){
				writer.flush();
				writer.close();
			}
		}
	}
	
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
		this.session = this.request.getSession();
	}
	
}
