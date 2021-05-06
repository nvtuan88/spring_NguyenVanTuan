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
<div class="w3-container">
    <a class="col-2 btn btn-primary align-self-center my-3" href="/creat">Create</a>
    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Ho Ten</th>
            <th>Ma sinh vien</th>
            <th>Gioi tinh</th>
            <th>Email</th>
            <th>Dien thoai</th>
            <th>Ngay sinh</th>
            <th>Que quan</th>


        </tr>
        <c:forEach var="s" items="${student}">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.masv}</td>
                <td>${s.gioitinh}</td>
                <td>${s.email}</td>
                <td>${s.sdt}</td>
                <td>${s.ngaysinh}</td>
                <td>${s.quequan}</td>

            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>