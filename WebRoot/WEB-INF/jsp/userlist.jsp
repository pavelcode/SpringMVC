<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   <script type="text/javascript">
     function batchdelete(){
       alert(document.forms[0]);
        document.forms[0].action="${pageContext.request.contextPath}/batchdeleteUser";
        document.forms[0].submit(); 
     }
   </script>
  </head>
  
  <body>
  <form method="post">
  <a href="${pageContext.request.contextPath}/saveUserUI.action">新增</a>
  <a onclick="javascript:batchdelete()">批量删除</a>
  <table border="1">
    <c:forEach  items="${alluser}" var="u">
        <tr>
          <td><input type="checkbox" name="checkid" value="${u.id}"></td>
          <td>${u.id}</td>
           <td>${u.name}</td>
           <td><a href="updateUserUI.action?id=${u.id}">修改</a></td>
           <td><a href="deleteUser.action?id=${u.id}">删除</a></td>
        </tr>
    </c:forEach>
    </table>
    </form>
  </body>
</html>
