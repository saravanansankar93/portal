package com.sarav.portal.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarav.portal.dao.UserInfoDAO;
import com.sarav.portal.model.UserInfo;

@Service
public class UserInfoServiceImp implements UserInfoService{

	@Autowired
	private UserInfoDAO userinfoDao; 
	
	@Transactional
	@Override
	public List<UserInfo> get() {
		return userinfoDao.get();
	}

	@Transactional
	@Override
	public void save(UserInfo userinfo) {
		userinfoDao.save(userinfo);
	}
}
