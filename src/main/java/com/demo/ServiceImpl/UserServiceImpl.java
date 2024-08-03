package com.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.UserRepo;
import com.demo.Service.UserService;
import com.demo.model.SystemUser;

@Service
public class UserServiceImpl implements UserService {
//	perform FDI
	@Autowired
	private UserRepo userRepo;

	@Override
	public String newUser(SystemUser systemUser) {
		// TODO Auto-generated method stub
		SystemUser suobj = new SystemUser();
		suobj.setUserName(systemUser.getUserName());
		suobj.setEmailId(systemUser.getEmailId());
		suobj.setUserPwd(systemUser.getUserPwd());
		
		suobj.setUserRole("Guest");
		suobj.setUserStatus("Prohibitted");
		
		userRepo.save(suobj);
		String str = "user registered successsfully...";
		return str;
	}

	@Override
	public List<SystemUser> users() {
		// TODO Auto-generated method stub
		
		return userRepo.findAll();
	}
}
