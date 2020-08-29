package com.sarav.portal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sarav.portal.model.UserInfo;

@Repository
public class UserInfoDAOImp implements UserInfoDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<UserInfo> get() {
		
		Session currsession = entityManager.unwrap(Session.class);
		
		Query<UserInfo> query = currsession.createQuery("from UserInfo",UserInfo.class);
		
		List<UserInfo> userlist = query.getResultList();
		
		return userlist;
	}

	@Override
	public UserInfo get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(UserInfo userinfo) {
		Session currsession = entityManager.unwrap(Session.class);
		currsession.saveOrUpdate(userinfo);	
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
