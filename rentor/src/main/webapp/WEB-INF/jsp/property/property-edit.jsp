
<%@page contentType="text/html;charset=utf-8"%>
<%@include file="../taglibs.jspf"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<tags:head title="Edit Property \#${property.id}: ${property.name}" />
<body id="property-edit">
  <h1>Edit Property #<c:out value="${property.id}"/>: <c:out value="${property.name}"/></h1>
  <form:form commandName="propertyData">
    <form:label path="name">Name</form:label>
    <form:input path="name" />
    <form:errors path="name" cssStyle="color:red"/>
    <br/>
    <input type="submit" value="Update Property" />
  </form:form>

    <hr/>

  <p>
    <a href="<c:url value="/"/>">Home</a>
  </p>
</body>
</html>
