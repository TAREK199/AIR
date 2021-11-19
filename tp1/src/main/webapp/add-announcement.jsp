<%--
  Created by IntelliJ IDEA.
  User: PCPRO
  Date: 10/11/2021
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add announcement</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<style>

    .form-group{
        width: 500px;
    }

</style>



<div class="card justify-content-center align-items-center h-100">


    <h1>Announcement Lists</h1>



    <form method="post" action="/">

        <div class="form-group">
            <label>Title</label>
            <input type="text" name="title" class="form-control form-control-alternative" required>
        </div>

        <div class="form-group">
            <label>Description</label>
            <input type="text-area" name="description" class="form-control form-control-alternative" required>
        </div>

        <div class="form-group">
            <label>Address</label>
            <input type="text" name="address" class="form-control form-control-alternative" required>
        </div>

        <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" class="form-control form-control-alternative" aria-describedby="emailHelp" required>
        </div>

        <button type="submit" class="btn btn-dark"> Add Announcement</button>

    </form>

</div>





</body>
</html>
