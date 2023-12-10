<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2023/12/10
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>管理员登录页面</title>
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript">
        /* if(top.location!=self.location){
              top.location=self.location;
         } */
    </script>
</head>
<body class="login_bg">
<section class="loginBox">
    <header class="loginHeader">
        <h1>管理员登录</h1>
    </header>
    <section class="loginCont">
        <form class="loginForm" action="${pageContext.request.contextPath}/LoginServlet"  name="actionForm"   method="post" >
            <div class="info">${requestScope.error }</div>
            <div style="display:flex;justify-content:center;align-items:center;">
                <input type="radio" name="userType" value="systemAdmin">系统管理员
                <input type="radio" name="userType" value="restaurantAdmin">食堂管理员
            </div>
            <!--<form class="loginForm" action="${pageContext.request.contextPath }/servlet.student.LoginServlet"  name="actionForm" id="actionForm"  method="post" >-->
            <!--<div class="info">${error}</div>-->
            <div class="inputbox">
                <label for="userCode">用户名：</label>
                <input type="text" class="input-text" id="userCode" name="userCode" placeholder="请输入用户名" required/>
            </div>
            <div class="inputbox">
                <label for="userPassword">密码：</label>
                <input type="password" id="userPassword" name="userPassword" placeholder="请输入密码" required/>
            </div>
            <div class="subBtn">
                <input type="submit" value="登录"/>
                <!--<input type="reset" value="重置"/>-->
            </div>
        </form>
    </section>
</section>
</body>
</html>
