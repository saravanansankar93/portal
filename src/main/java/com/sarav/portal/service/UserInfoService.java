package com.sarav.portal.service;

import java.util.List;

import com.sarav.portal.model.UserInfo;

public interface UserInfoService {

	List<UserInfo> get();

	void save(UserInfo userinfo);
}
