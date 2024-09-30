package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Users;

public interface UserService {
	boolean saveRegister(Users user);
	boolean loginQuery(String userName,String userPwd);
	List queryAll();
	Users queryById(int id);
	boolean updateById(Users user);
	boolean deleteById(int id);
}
