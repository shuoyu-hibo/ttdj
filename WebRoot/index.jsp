<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <link rel="SHORTCUT ICON" HREF="../../image/favicon.ico">
	<LINK REL="Bookmark" HREF="../../image/favicon.ico">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="application-name" content="TTDJ网－TTDJ一次 美一次，精品生活">
    <meta name="description" content="运城TTDJ网-运城代金券首选,专业品质运城代金券网!为您提供运城美食,电影票,KTV,酒店,旅游等运城代金券大全,运城代金券网站大全运城TTDJ网,您身边的吃喝玩乐好帮手!">
    <meta name="keywords" content="运城代金券,运城代金券网,运城代金券大全,运城代金券网站,运城代金券网站大全">
    <link rel="canonical" href="http://www.ttdaijin.com ">
    <link rel="alternate" href="http://www.ttdaijin.comfeed" title="订阅更新" type="application/rss+xml">
    <link rel="icon" href="/site-logo.jpg" sizes="16x16 32x32">
    <title>【运城代金券网】运城代金券大全_运城代金券网站_ttdaijin网</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <% response.sendRedirect("html/home/index.html"); %>
  </body>
</html>
