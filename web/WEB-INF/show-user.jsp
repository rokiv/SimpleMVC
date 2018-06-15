<%@ page import="model.User" %>
<!DOCTYPE html>
<html>
<head><title>Selected user</title>
<link href="./css/styles.css" 
      rel="stylesheet" type="text/css"/>
</head>
<body>
<table class="title">
  <tr><th>Selected user</th></tr>
</table>
<p/>
<%
  String id = request.getParameter("userId");
  if (request.getAttribute("user")!=null) {
%>
<ul>
  <li>ID: ${user.id}</li>
  <li>First name: ${user.firstName}</li>
  <li>Last name: ${user.lastName}</li>
</ul>
<%
  } else {
%>
  No user with ID = <%= id%>
<%
  }
%>
</body></html>