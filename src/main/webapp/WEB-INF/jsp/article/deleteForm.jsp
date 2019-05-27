<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<base href="${pageContext.request.contextPath }/" />
<title>게시판</title>
</head>
<body>
	<h2>글 삭제</h2>
	
	<script>
		alert("글 삭제");
		location.href = "./app/article/list";
	</script>
</body>
</html>