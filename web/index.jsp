<%--
  Created by IntelliJ IDEA.
  User: AOne
  Date: 6/12/2018
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple webapp</title>
</head>
<body>
<table class="title">
    <tr>
        <th>Select user</th>
    </tr>
</table>
<br/>
<fieldset>
    <form action="show-user">
        User ID:
        <input type="text" name="userId"/><br/>
        <input type="submit" value="Show User"/>
    </form>
</fieldset>
<br/>
</body>
</html>
