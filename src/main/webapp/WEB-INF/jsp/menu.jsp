<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>菜单列表页</title>
<%@include file="common/head.jsp"%>
</head>
<body>
	<div class="container">
		<div class="panel-head">
			<div class="panel-heading text-context">
				<nav class="navbar navbar-default " role="navigation">
					<div class="container-fluid">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target="#example-navbar-collapse">
								<span class="sr-only">切换导航</span> <span class="icon-bar"></span>
								<span class="icon-bar"></span> <span class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="/DishesAccounts">晚餐账单</a>
						</div>
						<div class="collapse navbar-collapse" id="example-navbar-collapse">
							<ul class="nav navbar-nav">
								<li><a href="/DishesAccounts/list">购买记录</a></li>
								<li class="active"><a href="/DishesAccounts/menu">菜单浏览</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
			<div class="panel-body">
				<a class="btn btn-info " href="/DishesAccounts/insertMenu">新增</a>
				<table class="table table-hover table-bordered">
					<thead>
						<tr class="success">
							<th>菜单</th>
							<th>用料</th>
							<th>时间</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="me" items="${menues}">
							<tr>
								<td>${me.menu.menuName}</td>
								<td><c:forEach var="ma" items="${me.materials}">
									`${ma.materialName}`<br />
								</c:forEach></td>
								<td><fmt:formatDate value="${me.menu.createTime }"
										pattern="yyyy-MM-dd HH:mm:ss" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>

</html>