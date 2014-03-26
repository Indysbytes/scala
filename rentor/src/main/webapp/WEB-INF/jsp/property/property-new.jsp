
<%@page contentType="text/html;charset=utf-8"%>
<%@include file="../taglibs.jspf"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<tags:head title="New Property" />
<body id="property-new">
  <h1>New Property</h1>
  <form:form commandName="propertyData">
    <form:label path="name">Name</form:label>  <form:input path="name" />  <form:errors path="name" cssStyle="color:red"/>
    <br/>
    <form:label path="tenant_name">Tenant Name</form:label>  <form:input path="tenant_name" />  <form:errors path="tenant_name" cssStyle="color:red"/>
    <br/>
    <form:label path="rent_start_date">Rent start date</form:label>  <form:input path="rent_start_date" />
    <br/>
    <form:label path="rent_charge">Rent charge</form:label>  <form:input path="rent_charge" />
    <br/>
    <form:label path="address">Adress</form:label>  <form:input path="address" />
    <br/>
    <form:label path="area_code">Area code</form:label>  <form:input path="area_code" />
    <br/>



    <input type="submit" value="Create Property" />
  </form:form>

  <hr/>

  <p>
    <a href="<c:url value="/"/>">Home</a>
  </p>
</body>
</html>
