<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html5>
<html>
<head>
	<meta charset="utf-8">
	<title>Insert title here</title>
</head>
<body>

<div align="center">

	<form action="<%= request.getContextPath() %>/login" method="post">
	<h1 >登入</h1>
	
	<div>Account :  <input type="text" name="account" style="width:200px" placeholder="account"></div>	
	<br/>
	<div>Password:  <input type="password" name="pwd" style="width: 200px" placeholder="password"></div>	
	
	<br/>
	<a href="<%= request.getContextPath() %>/sign_up/register.jsp">註冊</a>
	<p/>
	<div><input type="submit" value="Login">  <input type="reset" value="Reset"></div>	
	</form>
	
</div>


</body>
</html>