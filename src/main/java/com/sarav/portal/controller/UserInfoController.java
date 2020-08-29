package com.sarav.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarav.portal.service.UserInfoService;
import com.sarav.portal.model.UserInfo;

@RestController
@RequestMapping("/portal")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userinfoservice;
	
	@GetMapping("/list-user")
	public List<UserInfo> get(){
		return userinfoservice.get();
	}
	
	@PostMapping("/add-user")
	public UserInfo save(@RequestBody UserInfo userinfo) {
		userinfoservice.save(userinfo);
		return userinfo;
	}
	
}
