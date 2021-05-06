<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>Index</h1>
<c:set var="p" value="${product}"/>
<div class="w3-container">

    <form action="${pageContext.request.contextPath}/update" method="post">
        <input type="hidden" name="id" value="${s.id}">
        <div class="form-group">
            <label>Ho Ten :</label>
            <input class="form-control" type="text" name="name" value="${s.name}">
        </div>

        <div class="form-group">
            <label>Ma sinh vien :</label>
            <input class="form-control" type="text" name="age" value="${s.age}">
        </div>
        <div class="form-group">
            <label>Gioi tinh:</label>
            <input class="form-control" type="text" name="classId" value="${s.classId}">
        </div>
        <div class="form-group">
            <label>Email :</label>
            <input class="form-control" type="text" name="phone" value="${s.phone}">
        </div>
        <div class="form-group">
            <label>Dien thoai :</label>
            <input class="form-control" type="text" name="address" value="${s.address}">
        </div>
        <div class="form-group">
            <label>Ngay sinh :</label>
            <input class="form-control" type="text" name="address" value="${s.address}">
        </div>
        <div class="form-group">
            <label>Que quan :</label>
            <input class="form-control" type="text" name="address" value="${s.address}">
        </div>

        <button type="submit" class="btn btn-primary">Update</button>
    </form>
</div>
</body>
</html>