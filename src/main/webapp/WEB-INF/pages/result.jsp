<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<c:if test="${finishMsg ne null}">
<p>Registration Succeeded</p>
<p>Data : ${cmdObj}</p>
</c:if>

<c:if test="${cancelMsg ne null}">
<p>Registration Canceled</p><br>
</c:if>

<a href="form.htm">Registration Page</a>