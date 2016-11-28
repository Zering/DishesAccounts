<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
   <head>
      <title>购买列表页</title>
      <%@include file="common/head.jsp" %>
   </head>
   <body>
   		<div class="container">
   			<div class="panel panel-default">
   				<div class="panel-heading text-context">
   					<h2>购买列表</h2>
   				</div>
   				<div class="panel-body">
   					<a class="btn btn-info " href="/DishesAccounts/insert">新增</a>
   					<table class="table table-hover">
   						<thead>
   							<tr>
   								<th>名称</th>
   								<th>费用</th>
   								<th>时间</th>
   							</tr>
   						</thead>
   						<tbody>
   							<c:forEach var="da" items="${list}">
   								<tr>
   									<td>${da.dishName}</td>
   									<td>${da.price}</td>
   									<td>
										<fmt:formatDate value="${da.createTime }" pattern="yyyy-MM-dd HH:mm:ss"/>
									</td>
   								</tr>
   							</c:forEach>
   						</tbody>
   					</table>
   				</div>
   			</div>
   		</div>
   </body>
   <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>