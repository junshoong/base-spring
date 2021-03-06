<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page pageEncoding="UTF-8" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>To do List</title>
</head>
<body>
<div class="container">
	<h1> To do List </h1>
	<form class="form-inline" method="POST"
		action="${pageContext.request.contextPath}/item?itemAction=create">
		<div class="form-group">
			<label for="itemContent">Content</label>
			<input type="text" class="form-control" id="itemContent" name="content"
				 placeholder="My To do" value="${requestScope.itemDetail.content}"/>
		</div>
		<div class="form-group">
			<label for="itemLevel">Level</label>
			<input type="text" class="form-control" id="itemLevel" name="level"
				placeholder="Hard" value="${requestScope.itemDetail.level}"/>
		</div>
		<button type="submit" class="btn btn-default">Send invitation</button>
	</form>
		<table class="table table-hover">
			<tr>
				<th> id </th>
				<th> Content </th>
				<th> Level </th>
			</tr>
			<c:forEach items="${itemList}" var="item">
			<tr>
				<td><c:out value="${item.id}" /></td>
				<td><c:out value="${item.content}" /></td>
				<td><c:out value="${item.level}" /></td>
			</tr>
			</c:forEach>
		</table>
</div>
</body>
</html>