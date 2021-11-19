<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>



<div style="text-align: center">
    <h1>Announcements</h1>
</div>

<div style="text-align: center">

   ${list}


<%--    <table style="border: 5px ;color: coral">--%>
<%--        <caption> List of announcement</caption>--%>

<%--        <tr>--%>
<%--            <th>titre</th>--%>
<%--            <th>description</th>--%>
<%--            <th>address</th>--%>
<%--            <th>email</th>--%>
<%--        </tr>--%>

<%--&lt;%&ndash;        <p>${announcementlist.size()}</p>&ndash;%&gt;--%>

<%--        <c:forEach var="item" items="${list}">--%>

<%--            <tr>--%>
<%--                <td><c:out value="${item}"/></td>--%>
<%--&lt;%&ndash;                <td><c:out value="${announcement.description}"/></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <td><c:out value="${announcement.adress}"/></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <td><c:out value="${announcement.email}"/></td>&ndash;%&gt;--%>

<%--            </tr>--%>

<%--        </c:forEach>--%>

<%--    </table>--%>


    <a href="/add-announcement.jsp">New Announcement</a>
</div>



</body>
</html>