package com.silksoftware.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.silksoftware.domain.UserForm;
import com.silksoftware.service.UserManagerService;
@Controller
/*@ParentPackage("struts-default") 
@Namespace("/")
@Results({ @Result(name = "success", location = "/Success.jsp"), 
        @Result(name = "input", location = "/Register.jsp"),
        @Result(name = "error", location = "/Error.jsp")})*/
public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserForm userForm;
	
	@Autowired
	private UserManagerService userManagerService;
	
	public UserForm getUserForm() {
		return userForm;
	}
	public void setUserForm(UserForm userForm) {
		this.userForm = userForm;
	}
	
	public UserManagerService getUserManagerService() {
		return userManagerService;
	}
	public void setUserManagerService(UserManagerService userManagerService) {
		this.userManagerService = userManagerService;
	}
	@Override
	public String execute() {
		
         if(userManagerService.regUser(userForm)){
        	 System.out.println(userForm.getFirstName()+"+"+userForm.getLastName()+
        			 "+"+userForm.getPassword()+"+"+userForm.getSex());
        	 return SUCCESS; 
         }else{
        	 return ERROR;
         }  
	}
	
	public void validate(){
		if(null == userForm.getFirstName() || "".equals(userForm.getFirstName().trim()))  
        {  
            this.addFieldError("userForm.firstName", "firstName is required!");  
        }  
        if(null == userForm.getPassword() || "".equals(userForm.getPassword().trim()))  
        {  
            this.addFieldError("userForm.password", "password is required!");  
        }  
	}

}
