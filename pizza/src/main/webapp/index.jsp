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
		<input type="submit" value="����Ʈ �̵�">
	</form>
	${sid }
	<form action="login">
	�α���<br>
	���̵�<input type="text" name="userId"><br>
	��й�ȣ<input type="password" name="userPw"><br>
	<input type="submit" value="Login">
	
	</form>
</body>
</html>