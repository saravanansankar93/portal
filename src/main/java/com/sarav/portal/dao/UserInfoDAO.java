package com.sarav.portal.dao;

import java.util.List;
import com.sarav.portal.model.UserInfo;

public interface UserInfoDAO {
	
	List<UserInfo> get();
	
	UserInfo get(int id);
	
	void save(UserInfo userinfo);
	
	void delete(int id);
}
