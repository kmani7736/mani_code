<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>
	<center>Customer Registration Form</center>
</h1>
<form:form method="post" commandName="cmdObj">
Name2: <form:input path="name2" />
	<hr>
	<input type="submit" value="previous" name="target0" />
	<input type="submit" value="next" name="target2" />
	<input type="submit" value="cancel" name="cancel" />
</form:form>