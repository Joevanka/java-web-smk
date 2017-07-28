<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="controller">
	<div id="input-data">
		<form action="/employee/save" method="post">
			<input type="text" name="name" placeholder="enter your name" /><br/>
			<input type="text" name="address" placeholder="enter your address" /><br/>
			<input type="text" name="noHp" placeholder="enter your hp" /><br/>
			<input type="number" name="salary" placeholder="enter your salary" /><br/>
			<input type="submit" name="submit" value="save"/>
		</form>
	</div>
	</p>
	<table>
		<thead>
			<tr>
				<td>Name</td>
				<td>Address</td>
				<td>Salary</td>
				<td>Nohp</td>
				<td>Action</td>
			</tr>
		</thead>
		
		<c:forEach items="${listEmployee }" var="employee">
			<tr>
				<td><c:out value="${employee.name }" /></td>
				<td>${employee.address }</td>
				<td>${employee.salary }</td>
				<td>${employee.noHp }</td>
				<td>
					<a onclick="return doDelete('${employee.id }', '${employee.name }')" href="#">Delete</a>
					<a href="#">|</a>
					<a href="#">Update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
<script>
	function doDelete(id, name){
		var conf = confirm("are you sure delete this "+ name + " ?");
		if(conf == true){
			window.location = "/employee/delete/"+id;
		}
		return false;
	}
</script>
</html>