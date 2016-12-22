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
				<form action="/DishesAccounts/insert" method="post">
					<div class="control-group">
						<label class="control-label" for="dishName">菜名</label>
						<div class="controls">
							<input name="dishName" type="text" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="price">价格</label>
						<div class="controls">
							<input name="price" type="text" />
						</div>
					</div>
					<button type="button" class="btn btn-info" onclick="insertDish();">新增</button>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	function insertDish(){
		$(this).addClass("disabled");
		document.forms[0].submit();
	}
	</script>
</body>
</html>