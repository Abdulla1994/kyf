<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 1/17/2021
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Konullu Yardim Fonduna Muracietin Qeydiyyati</title>
</head>
<body>
<h1>Muracieti Tam Doldurun</h1>

<form:form modelAttribute="form" action="register-request" method="post">
    Ad:<form:input path="name" /></br>
    Soyad:<form:input path="surname" /></br>
    Region:<form:input path="region"/></br>
    Telefon:<form:input path="phone"/></br>
    Status:<form:input path="status"/></br>
    Unvan:<form:input path="address"/></br>
    Ehtiyaclar:<form:input path="needs"/></br>
    Qeyd:<form:input path="note"/></br>
    Vasiteci:<form:input path="contactPerson"/></br>



</form:form>


</body>
</html>
