<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<portlet:actionURL var="saveEmployeeUrl" name="saveEmployee">
	<portlet:param name="saveMode" value="add"/>
</portlet:actionURL>
<h3>New Employee Entry</h3>

<aui:form action="<%=saveEmployeeUrl %>" >
	<input name="<portlet:namespace />username" type="text"/>
	<input type="submit" value="save">
</aui:form>