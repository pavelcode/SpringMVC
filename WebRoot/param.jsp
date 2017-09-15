<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'param.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	  function simpleParam(){
	   document.paramform.action="simpleParam";
	   document.paramform.submit();
	  }
	  function annotationParam(){
	   document.paramform.action="annotationParam";
	   document.paramform.submit();
	  }
	  function objectParam(){
	   document.paramform.action="objectParam";
	   document.paramform.submit();
	  }
	  function pojoParam(){
	   document.paramform.action="pojoParam";
	   document.paramform.submit();
	  }
	  function listParam(){
	   document.paramform.action="listParam";
	   document.paramform.submit();
	  }
	  function mapParam(){
	   document.paramform.action="mapParam";
	   document.paramform.submit();
	  }
	  
	</script>

  </head>
  
  <body>
    <form name="paramform" method="post">
      <input type="text" name="id" >
      <input type="button" value="简单参数" onclick="simpleParam()">
       <input type="button" value="注解参数" onclick="annotationParam()">
       <input type="button" value="对象参数" onclick="objectParam()">
       <br/>
       <input type="text" name="stuname"> <input type="text" name="stupass">
       <input type="button" value="pojo参数" onclick="pojoParam()">
       <br/>
          用户名<input type="text" name="studentList[0].stuname"/><br/>
          密码<input type="password" name="studentList[0].stupass"/><br/>
          用户名<input type="text" name="studentList[1].stuname"/><br/>
          密码<input type="password" name="studentList[1].stupass"/><br/>
          <input type="button" value="list集合" onclick="listParam()">
        <br/>
         用户名<input type="text" name="studentMap['s1'].stuname"/><br/>
          密码<input type="password" name="studentMap['s1'].stupass"/><br/>
          用户名<input type="text" name="studentMap['s2'].stuname"/><br/>
          密码<input type="password" name="studentMap['s2'].stupass"/><br/>
           <input type="button" value="map集合" onclick="mapParam()">
         
       
    </form>
  </body>
</html>
