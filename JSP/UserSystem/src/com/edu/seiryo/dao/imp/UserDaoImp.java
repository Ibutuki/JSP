package com.edu.seiryo.dao.imp;
import com.edu.seiryo.dao.UserDao;

import java.util.List;

import org.apache.catalina.User;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.edu.seiryo.entity.Users;
import com.edu.seiryo.util.DBUtil;

public class UserDaoImp implements UserDao{
	ResultSet rs = null;
	/*
	 * 注册储存用户信息
	 */
	public boolean saveRegister(Users user){
		String sql = "insert into t_user(account,password,sex,email) values(?,?,?,?)";
		boolean bo = false;
		try {
			bo = DBUtil.executeUpdate(sql, user.getAccount(),user.getPassword(),user.getSex(),user.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 登录用户信息
	 */
	public boolean loginQuery(String userName,String userPwd){
		boolean bo = false;
		String sql = "select account from t_user where account = ? and password = ?";
		try {
			rs = DBUtil.executeQuery(sql, userName, userPwd);
			bo = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	public List queryAll() {
		List<Users> list = new ArrayList<Users>();
		String sql = "select id,account,password,sex,email from t_user";
		Users user = null;
		try {
			rs = DBUtil.executeQuery(sql);
			while(rs.next()){
				user = new Users();
				user.setId(rs.getInt(1));
				user.setAccount(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setSex(rs.getString(4));
				user.setEmail(rs.getString(5));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public Users queryById(int id) {
		String sql = "select id,account,password,sex,email from t_user where id = ?";
		Users user = null;
		try {
			rs = DBUtil.executeQuery(sql,id);
			while(rs.next()){
				user = new Users();
				user.setId(rs.getInt(1));
				user.setAccount(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setSex(rs.getString(4));
				user.setEmail(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user;
	}
	public boolean updateById(Users user) {
		String sql = "update t_user set account = ?,password = ?,sex = ?,email = ? where id = ? ";
		boolean bo = false;
		try {
			bo = DBUtil.executeUpdate(sql, user.getAccount(),user.getPassword(),user.getSex(),user.getEmail(),user.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	public boolean deleteById(int id) {
		String sql = "delete from t_user where id = ?";
		boolean bo = false;
		try {
			bo = DBUtil.executeUpdate(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
}
