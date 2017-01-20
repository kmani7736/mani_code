<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>
	<center>Customer Registration Form</center>
</h1>

<form:form method="post" commandName="cmdObj">
Name 3 : <form:input path="name3"/>
<hr>
<input type="submit" value="Cancel" name="cancel"/>
<input type="submit" value="Finish" name="finish"/>
<input type="submit" value="previous" name="target1"/>
</form:form>