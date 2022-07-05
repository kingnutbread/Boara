<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/boa/resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#frm').submit();
	});
</script>
</head>
<body>
<c:if test="${not empty VIEW}">
	<form method="POST" action="${VIEW}" id="frm" name="frm">
		<input type="hidden" name="id" value="${SID}">
	<c:if test="${not empty param.nowPage}">
		<input type="hidden" name="nowPage" value="${param.nowPage}">
	</c:if>	
	<c:if test="${not empty MSG}">
		<input type="hidden" name="msg" value="${MSG}">
	</c:if>
	<c:if test="${not empty param.bno}">
		<input type="hidden" name="bno" value="${param.bno}">
	</c:if>		
	<c:if test="${not empty param.cno}">
		<input type="hidden" name="cno" value="${param.cno}">
	</c:if>		
	<c:if test="${not empty param.bnowPage}">
		<input type="hidden" name="bnowPage" value="${param.bnowPage}">
	</c:if>		
	</form> 
</c:if>		
</body>
</html>