<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>新增购买</title>
<%@include file="common/head.jsp"%>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-context">
				<h2>购买</h2>
			</div>
			<div class="panel-body">
				<form action="/DishesAccounts/insert" class="form-horizontal"
					role="form" method="post">
					<div class="form-group">
						<label class="col-sm-1 control-label" for="dishName">菜名</label>
						<div class="col-sm-6">
							<input class="form-control" name="dishName" type="text" placeholder="请输入菜名"/>
						</div>
					</div>
					<div class="form-group">
						<label class=" col-sm-1 control-label" for="price">价格</label>
						<div class="col-sm-6">
							<input class="form-control" name="price" type="text" placeholder="请输入价格"/>
						</div>
					</div>
					<button type="button" class="btn btn-info" onclick="insertDish();">新增</button>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function insertDish() {
			$(this).addClass("disabled");
			document.forms[0].submit();
		}
	</script>
</body>
</html>