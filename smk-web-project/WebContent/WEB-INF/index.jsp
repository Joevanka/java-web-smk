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
	<div id="input-data">
		<form action="./employee" method="post">
			<input type="text" name="name" placeholder="enter your name" /><br/>
			<input type="text" name="address" placeholder="enter your address" /><br/>
			<input type="text" name="nohp" placeholder="enter your hp" /><br/>
			<input type="number" name="salary" placeholder="enter your salary" /><br/>
			<input type="submit" name="submit" value="save"/>
		</form>
	</div>
	<hr/>
	<table style="border-collapse: collapse; width: 100%" border=1>
		<thead>
			<tr>
				<th>Name</th>
				<th>Address</th>
				<th>Salary</th>
				<th>Hp</th>
				<th>Action</th>
			</tr>
		</thead>
		<c:forEach var="employee" items="${listEmp}">
			<tr>
				<td>${employee.name}</td>
				<td>${employee.address}</td>
				<td>${employee.salary}</td>
				<td>${employee.noHp}</td>
				<td>
					<a href="#">update</a>
					<a onclick='return doDelete(""+${employee.id})' href="#">delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<script>
		function doDelete(id){
			var conf = confirm("are you sure delete this data ?");
			if(conf == true){
				window.location = "./employee?delete="+id;	
			}
			
			return false;
			
		}
	</script>
</body>
</html>