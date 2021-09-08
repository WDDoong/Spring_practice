<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
	<h1>섭씨온도를 화씨온도로 바꿔보자</h1>
		<form action="/ctof" method="post">
			<input type="number" step="0.1" name="cel" placeholder="현재온도 입력.">
			<input type="submit" value="화씨온도 알아보기">
		</form>
	</body>

</html>