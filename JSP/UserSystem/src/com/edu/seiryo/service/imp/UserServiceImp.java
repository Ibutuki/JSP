package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.Users;
import com.edu.seiryo.service.UserService;

public class UserServiceImp implements UserService{
	UserDao dao = new UserDaoImp();
	public boolean saveRegister(Users user) {
		return dao.saveRegister(user);
	}

	public boolean loginQuery(String userName, String userPwd) {
		return dao.loginQuery(userName, userPwd);
	}

	public List queryAll() {
		return dao.queryAll();
	}

	public Users queryById(int id) {
		return dao.queryById(id);
	}

	public boolean updateById(Users user) {
		return dao.updateById(user);
	}

	public boolean deleteById(int id) {
		return dao.deleteById(id);
	}

}
