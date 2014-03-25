
<%@page contentType="text/html;charset=utf-8"%>
<%@include file="../taglibs.jspf"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<tags:head title="Property \#${property.id}: ${property.name}" />
<body id="property-view">
  <h1>
    Property #<c:out value="${property.id}" />: <c:out value="${property.name}" />
  </h1>
  <p>
    <a href="<c:url value="/properties/${property.id}.html?edit"/>">Edit the Property Details</a>
  </p>
    <hr/>
  <p>
    <form id="deletePropertyForm" style="height:0;" action="<c:url value="/properties/${property.id}.html"/>" method="POST">
      <input type="hidden" name="_method" value="delete"/>
    </form>
    <a href="#" onclick="document.getElementById('deletePropertyForm').submit(); return false;">Delete the Property</a>
  </p>
  <hr/>
  <p>
    <a href="<c:url value="/"/>">Home</a>
  </p>
</body>
</html>
