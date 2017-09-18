<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shiroLabel.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <shiro:principal property="username"/>
    <shiro:hasRole name="管理员">  
  		  用户[<shiro:principal/>]拥有角色管理员<br/>  
	</shiro:hasRole>
    <shiro:hasRole name="普通用户">  
  		  用户[<shiro:principal/>]拥有角色admin<br/>  
	</shiro:hasRole>
	
	<shiro:hasAnyRoles name="普通用户,管理员">  
   	 用户[<shiro:principal/>]拥有角色admin或user<br/>  
	</shiro:hasAnyRoles>  
	
	<shiro:lacksRole name="abc">  
 	  	 用户[<shiro:principal/>]没有角色abc<br/>  
	</shiro:lacksRole> 
	
	<shiro:hasPermission name="业务处理">  
   		 用户[<shiro:principal/>]拥有权限业务处理<br/>  
	</shiro:hasPermission>   
	<shiro:lacksPermission name="org:create">  
    	用户[<shiro:principal/>]没有权限org:create<br/>  
	</shiro:lacksPermission>   
  </body>
</html>
