<%--
  Created by IntelliJ IDEA.
  User: ShineYoung
  Date: 2018/11/13
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login</title>
  </head>
  <body>
        <form method="post" action="/login/login">
          用户名：<input type="text" name="name"/></br>
          密&nbsp码：<input type="password" name="password"/>
          <input type="submit" value="登陆">
        </form>
  </body>
</html>
