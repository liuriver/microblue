<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>myjsp</title>
<script type="text/javascript" src="js/jquery-1.8/jquery-1.8.0.min.js"></script>
</head>

<script>
	function select() {
		htmlobj = $.ajax({
			url : "login.do",
			async : false
		}).responseText;

	}
</script>
<body>
	<div id="myDiv"></div>
	<table>
		<c:forEach items="${users}" var="user">
			<tr>
				<td><c:out value="${user.userId }"></c:out></td>
				<td>${user.roles }</td>
				<td>${user.password }</td>
			</tr>
		</c:forEach>
	</table>

	<button name="sub" onclick="select()">查询数据库</button>

</body>
</html>
