<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>BMI ���� & ����</h1>
<h3>Ű�� �����Ը� �Է����ּ���.</h3>
<form action="/getbmi" method="post">
	<input type="number" step="0.1" name="cm" placeholder="Ű �Է¶�"><br/>
	<input type="number" name="kg" placeholder="������ �Է¶�"><br/>
	<input type="submit" value="bmi ���">
</form>
</body>
</html>