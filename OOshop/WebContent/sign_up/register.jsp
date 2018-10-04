<%@ page language="java" contentType="text/html; charset=utf-8" import="java.sql.*"
    pageEncoding="utf-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">

		<form action="<%= request.getContextPath() %>/RegisterController" method="post">
		<h1 >註冊</h1>
		<table border=0>
		<tr>
			<td>Account :  </td>
			<td><input type="text" name="raccount" style="width:200px" ></td>
		</tr>
		<tr>
			<td>Password:  </td>
			<td><input type="password" name="rpwd" style="width: 200px" ></td>
		</tr>
		<tr>
			<td width=20>E-mail  : </td>
			<td><input type="text" name="mail" style="width: 200px" ></td>
		</tr>
		</table>
		<br/>
		<div>
	
		
	<%=request.getParameter("raccount")%>
	註冊否?<%=request.getAttribute("accountExist")%>
	
	<br/>
	
	帳號::<%=request.getAttribute("ra") %>
	<br/>
	密碼<%=request.getAttribute("rp") %>
	<br/>
	MAIL::<%=request.getAttribute("re") %>
	<br/>
	searchAccount::<%=request.getAttribute("searchAccount") %>
	<br/>
	<% if(request.getAttribute("accountExist")=="t"){ %>
	 	 用户名已经存在 
	<%}else if(request.getAttribute("accountNull")=="t"){ %>
	  	欄位為空
	<% }%>	
	 
	  
	
	</div>
		<div><input type="submit" value="Check">  <input type="reset" value="Reset"></div>	
		</form>
	
	</div>
	
	
	

	
</body>
</html>