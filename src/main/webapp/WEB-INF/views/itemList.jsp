<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>To do List</title>
</head>
<body>
	<form name="itemList" method="POST"
		action="${pageContext.request.contextPath}/">
		<ul>
		<c:forEach items="${itemList}" var="item">
			<li>
				<c:out value="${item.id}" />
				<c:out value="${item.content}" />
				<c:out value="${item.level}" />
			</li>
		</c:forEach>
		</ul>
	</form>

</body>
</html>