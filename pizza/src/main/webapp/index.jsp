<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>mainMenu.jsp</title>
</head>
<body>
	<form action="listProduct">
		<input type="hidden" name="listType" value="main">
		<input type="submit" value="리스트 이동">
	</form>
	${sid }
	<form action="login">
	로그인<br>
	아이디<input type="text" name="userId"><br>
	비밀번호<input type="password" name="userPw"><br>
	<input type="submit" value="Login">
	
	</form>
</body>
</html>