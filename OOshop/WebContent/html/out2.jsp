<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
登入失敗！
您提交的資訊為：<br/>
	Account: <%=request.getParameter("account") %><br/>
	Password: <%=request.getParameter("pwd") %><br/>

<a href="<%= request.getContextPath() %>/html/login.jsp">返回登入頁面</a>
</body>
</html>