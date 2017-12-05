<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register page</title>
<s:head />
</head>
<body>
	<h1>Registration action with annotation</h1>
	<s:form action="/Membership/RegisterProcessor">
	
		<s:textfield name="user.name" label="User name"/>
		<s:checkbox name="user.canReceiveJunk" label="Can receive junk?"/>
		<s:submit label="S'inscrire"/>
	</s:form>
</body>
</html>