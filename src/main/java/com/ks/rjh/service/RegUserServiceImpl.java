package com.ks.rjh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ks.rjh.dao.RegUserDao;
import com.ks.rjh.entity.User_Info;

@Service
public class RegUserServiceImpl implements RegUserService {

	@Autowired
	RegUserDao dao;
	
	@Override
	public int insertUserInfo(String id, String password, String email1, String email2) {

		User_Info userinfo = new User_Info();
		userinfo.setId(id);
		userinfo.setPassword(password);
		String email = email1 + "@" + email2;
		userinfo.setEmail(email);
		
		int result = dao.insertUserInfo(userinfo);
		
		return result;
	}

}
