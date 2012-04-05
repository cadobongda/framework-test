<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html" isELIgnored="false" %>
<div id="greeting"><c:out value="${hellomessage}"/></div>

<script type="text/javascript">
	xj("#greeting").click(function()
	{
		xj(this).slideUp();
	});
</script>
