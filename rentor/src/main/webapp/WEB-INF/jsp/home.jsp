
<%@page contentType="text/html;charset=utf-8"%>
<%@include file="taglibs.jspf"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<tags:head title="Scala - Spring - Hibernate - Maven Webapp">
  <meta name="description" content="A webapp with Scala, Spring, Hibernate and Maven.">
  <meta name="keywords" content="scala, spring, hibernate, maven">
</tags:head>
<body id="home">
  <p>
    <a href="<c:url value="/hello.html"/>">Server Name</a>
  </p>
  <p>
    <a href="<c:url value="/static.htm"/>">Static File</a>
  </p>
  <h2>Customers</h2>
  <ul id="customer-list">
    <c:forEach items="${customers}" var="customer">
      <li><a href="<c:url value="/customers/${customer.id}.html"/>">#<c:out value="${customer.id}" />: <c:out value="${customer.name}" />
      </a>
      </li>
    </c:forEach>
  </ul>
  <p>
    <a href="<c:url value="/customers/new.html"/>">Add a Customer</a>
  </p>
  <p>
    <form id="deleteAllCustomersForm" style="height:0;" action="<c:url value="/customers.html"/>" method="POST">
      <input type="hidden" name="_method" value="delete"/>
    </form>
    <a href="#" onclick="document.getElementById('deleteAllCustomersForm').submit(); return false;">Delete All Customers</a>
  </p>

<hr>


  <h2>Property</h2>
  <ul id="property-list">
    <c:forEach items="${properties}" var="property">
      <li><a href="<c:url value="/property/${property.id}.html"/>">#<c:out value="${property.id}" />: <c:out value="${property.name}" />
      </a>
      </li>
    </c:forEach>
  </ul>
  <p>
    <a href="<c:url value="/property/new.html"/>">Add a Property</a>
  </p>
  <p>
    <form id="deleteAllPropertiesForm" style="height:0;" action="<c:url value="/property.html"/>" method="POST">
      <input type="hidden" name="_method" value="delete"/>
    </form>
    <a href="#" onclick="document.getElementById('deleteAllPropertiesForm').submit(); return false;">Delete All Properties</a>
  </p>


</body>
</html>
