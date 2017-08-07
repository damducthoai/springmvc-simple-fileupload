<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 7/30/2017
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Spring MVC File Upload</title>
</head>
<body>
<h1>Wellcome to Spring MVC Simple File Upload</h1>
<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/><br>
    <input type="submit" name="submit" value="submit"/>
</form>
</body>
</html>
