<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>BMI 측정 & 계산기</h1>
<h3>키와 몸무게를 입력해주세요.</h3>
<form action="/getbmi" method="post">
	<input type="number" step="0.1" name="cm" placeholder="키 입력란"><br/>
	<input type="number" name="kg" placeholder="몸무게 입력란"><br/>
	<input type="submit" value="bmi 계산">
</form>
</body>
</html>