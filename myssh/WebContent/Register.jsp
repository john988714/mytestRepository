<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 500px; margin: auto; padding:10px; background: #efefef; border: 1px solid #ccc;">
	 <s:form action="register">  
        <s:textfield name="userForm.firstName" label="用户名"></s:textfield>  
        <s:textfield name="userForm.lastName" label="用户名"></s:textfield>  
        <s:password name="userForm.password" label="密码"></s:password>  
        <s:select list="#{'1':'男','0':'女'}" listKey="key" listValue="value"  
            name="userForm.sex" label="性别" value="1"></s:select>  
        <s:submit value="注册"></s:submit>  
    </s:form>
    </div> 
</body>
</html>