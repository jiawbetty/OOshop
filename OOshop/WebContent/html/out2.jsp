<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
�n�J���ѡI
�z���檺��T���G<br/>
	Account: <%=request.getParameter("account") %><br/>
	Password: <%=request.getParameter("pwd") %><br/>

<a href="<%= request.getContextPath() %>/html/login.jsp">��^�n�J����</a>
</body>
</html>