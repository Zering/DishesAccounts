<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <title>首页</title>
      <%@include file="/WEB-INF/jsp/common/head.jsp" %>
   </head>
   <body>
   		<div class="container">
   			<div class="panel panel-default">
   				<div class="panel-heading text-context">
   					<h2>功能项</h2>
   				</div>
   				<div class="panel-body">
   					<a class="btn btn-info " href="/DishesAccounts/list">购买记录</a><br />
   						<p class="text-left text-info lead">
   							做菜材料的购买记录
   						</p>
   					<a class="btn btn-info " href="/DishesAccounts/menu">菜单浏览</a>
   						<p class="text-left text-info lead">
   							做菜所需的材料搭配
   						</p>
   				</div>
   			</div>
   		</div>
   </body>
   <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>