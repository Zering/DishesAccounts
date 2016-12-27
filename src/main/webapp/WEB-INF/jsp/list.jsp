<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>购买列表页</title>
<%@include file="common/head.jsp"%>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-context">
				<nav class="navbar navbar-default navbar-static-top"
					role="navigation">
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
								<li class="active"><a href="/DishesAccounts/list">购买记录</a></li>
								<li><a href="/DishesAccounts/menu">菜单浏览</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
			<div class="panel-body">
				<a class="btn btn-info " href="/DishesAccounts/insert">新增</a>
				<button type="button" class="btn btn-info" id="viewTodayMenu">今日计划</button>
				<table class="table table-hover" id="todayPlan"></table>
				<table class="table table-hover">
					<thead>
						<tr class="success">
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
								<td><fmt:formatDate value="${da.createTime }"
										pattern="yyyy-MM-dd HH:mm:ss" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>

<script>
	$("#viewTodayMenu").one(
			"click",
			function() {
				var tbodystr = "";
				$.post("/DishesAccounts/getTodayPlans", {}, function(result) {
					var planEle = $("#todayPlan");
					for (var i = 0; i < result.length; i++) {
						tbodystr += "<tr class=\"warning\">";
						tbodystr += "<td>计划" + (i + 1) + "</td>";
						/* tbodystr += "<td>"+new Date(result[i].menu.createTime)+"</td>"; */
						tbodystr += "<td>" + result[i].menu.menuName + "</td>";
						tbodystr += "<td>";
						for (var j = 0; j < result[i].materials.length; j++) {
							tbodystr += "`"
									+ result[i].materials[j].materialName
									+ "`<br />";
						}
						tbodystr += "</td>";
						tbodystr += "</tr>";
					}

					planEle.append(tbodystr);
					console.log("result:" + result);
				})
			});
</script>

</html>