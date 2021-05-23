<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><decorator:title></decorator:title></title>
<link
	href='<c:url value='/template/web/bootstrap/css/bootstrap.min.css'/>'
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href='<c:url value='/template/web/css/small-business.css'/>'
	rel="stylesheet">
</head>
<body>
	<!-- Navigation -->
	<%@ include file="/common/web/header.jsp"%>

	<decorator:body></decorator:body>
	<%@ include file="/common/web/footer.jsp"%>
	<!-- Bootstrap core JavaScript -->
	<script src='<c:url value='/template/web/jquery/jquery.min.js'/>'></script>
	<script
		src='<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js'/>'></script>
</body>
</html>