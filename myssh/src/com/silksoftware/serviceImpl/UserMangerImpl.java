package com.silksoftware.serviceImpl;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.silksoftware.dao.BaseDao;
import com.silksoftware.domain.User;
import com.silksoftware.domain.UserForm;
import com.silksoftware.service.UserManagerService;

@Service
@Transactional
public class UserMangerImpl implements UserManagerService {
	
	@Autowired
	private BaseDao dao;  
	  
	public BaseDao getDao() {
		return dao;
	}

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public boolean regUser(UserForm userForm) {
		
		if(userForm == null){
			return false;
		}else{
			User user = new User();
			BeanUtils.copyProperties(userForm, user);  
			dao.saveObject(user);
			return true;
		}
	}
}
