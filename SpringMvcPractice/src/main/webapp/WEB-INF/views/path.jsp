<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>���� ���� ��� �������� ${page}������ �Դϴ�.</h1>
<!-- jstl�� Ȱ���ؼ� �������� 100�̸��̸� �ϴܿ� h2�±׸� �̿��ؼ�
	"�ʹݺ� �Դϴ�.", 100�̻� 200�̸��̸� "�߹ݺ� �Դϴ�.", 200�̻��̸� "�Ĺݺ� �Դϴ�."
	��� ������ �߰��� ������ּ���.-->
	<c:if test="${page < 100 }">
		<h2>�ʹݺ� �Դϴ�.</h2>
	</c:if>
	<c:if test="${page >= 100 && page < 200 }">
		<h2>�߹ݺ� �Դϴ�.</h2>
	</c:if>
	<c:if test="${page > 200 }">
		<h2>�Ĺݺ� �Դϴ�.</h2>
	</c:if>
</body>
</html>