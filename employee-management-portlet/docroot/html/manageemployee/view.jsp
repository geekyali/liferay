<%@page import="java.util.List"%>
<%@page import="com.liferay.sample.model.Employee"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/html/manageemployee/add.jsp" />
</portlet:renderURL>

<h3>Employee directory</h3>
<a href="<%=addURL%>">Add Employee</a>
<%List<Employee> employees=(List<Employee>)request.getAttribute("employees");%>
<table>
<tr>
<th>Emp id</th>
<th>Name</th>
<th>Actions</th>
</tr>
<%
for(Employee emp : employees){
	%>
	<tr>		
		<td><%=emp.getEmpId()%></td>
		<td><%= emp.getUserName()%></td>		
		<!-- <td><input value="Edit" type="button"/><input value="Delete" type="button"/></td> -->
	</tr>	
	<%
}
%>
</table>