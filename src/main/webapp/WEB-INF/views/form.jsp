
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
${inst}
<form action="formhandler" method="post">
    First Name:  <input type="text" name="firstName"><br>
   Last Name:  <input type="text" name="lastName"><br>
    Email:  <input type="name" name="email"><br>
    Phone Number:  <input type="number" name="phoneNumber"><br>
    Password:  <input type="text" name="password"><br>
    <input type="radio" name="gender" value="male"> Male<br>
    <input type="radio" name="gender" value="female"> Female<br>
    <select name="coffee">
        <option value=""></option>
        <option value="Regular">Regular</option>
        <option value="Decaf">Decaf</option>
        <option value="Iced">Iced</option>
    </select>
    <textarea name="message" rows="10" cols="30"></textarea>
    <br>
    <input type="submit" name="submit" value="Submit">
</form>
</body>
</html>
