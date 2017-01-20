<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1><center>Customer Registration Form</center></h1>
<form:form method="post" commandName="cmdObj" action="form.htm">
Name1 :<form:input path="name1"/>
<hr>
<input type="submit" value="next" name="target1"/>
<input type="submit" value="cancel" name="cancel"/>
</form:form>