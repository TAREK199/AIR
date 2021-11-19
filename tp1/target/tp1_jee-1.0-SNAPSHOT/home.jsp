<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Tp</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>



<div style="text-align: center">
    <h1>Announcements</h1>
</div>

<style>

    .container{
        width: 600px;
        text-align: center;
    }

</style>

<div class="container">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th>titre</th>
            <th>description</th>
            <th>address</th>
            <th>email</th>
        </tr>
        <c:forEach var="item" items="${list}">
            <tr>
                <td><c:out value="${item.title}"/></td>
                <td><c:out value="${item.description}"/></td>
                <td><c:out value="${item.adress}"/></td>
                <td><c:out value="${item.email}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

<button class="btn btn-outline-secondary">
    <a href="/add-announcement.jsp">New Announcement</a>

</button>
</div>



</body>
</html>