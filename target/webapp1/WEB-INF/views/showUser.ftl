<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User info</title>
    <style type="text/css">
        TABLE {
            width: 70%;
            height: 200px;
            align-content: center;
        }
    </style>
</head>
<body>
<h1 align="center">User info</h1>
<table border="1" align="center">
    <caption>Users</caption>
    <tr>
        <td>Id</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${user.age}</td>
    </tr>

</table>
<br>
<a href="../users">Back</a>
</body>
</html>