<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<style type="text/css">
    TABLE {
        width: 70%;
        height: 100px;
        align-content: center;
    }
</style>
<body>
<h1 align="center">
    Users list
</h1>


<table border="1" align="center">
    <caption>Users</caption>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>
    <#list users as user>
        <tr>
            <td><a href="user/${user.id}">${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
            <td><a href="update/${user.id}">Update</a></td>
            <td><a href="delete/${user.id}">Delete</a></td>
        </tr>
    </#list>
</table>


<a href="./addUser">Create user</a>
</body>
</html>