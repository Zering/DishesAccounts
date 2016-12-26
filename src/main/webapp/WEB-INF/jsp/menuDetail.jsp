<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>新增菜单</title>
<%@include file="common/head.jsp"%>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-context">
				<a href="/DishesAccounts/menu"><h2>菜单</h2></a>
			</div>
			<div class="panel-body">
				<form action="/DishesAccounts/insertMenu" class="form-horizontal" role="form" method="post">
					<div class="form-group">
						<label class="col-sm-1 control-label" for="menu">菜单</label>
						<div class="col-sm-6">
							<input class="form-control" name="menu.menuName" type="text" placeholder="请输入菜名"/>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-1 control-label" for="材料1">材料1</label>
						<div class="col-sm-6">
							<input class="form-control" name="materials[0].materialName" type="text" placeholder="请输入材料名"/>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1 control-label" for="材料2">材料2</label>
						<div class="col-sm-6">
							<input class="form-control" name="materials[1].materialName" type="text" placeholder="请输入材料名"/>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1 control-label" for="材料3">材料3</label>
						<div class="col-sm-6">
							<input class="form-control" name="materials[2].materialName" type="text" placeholder="请输入材料名"/>
						</div>
					</div>

					<div class="accordion-group">
						<div id="moreMaterials" class="accordion-body collapse">
							<div class="accordion-inner">
								<div class="form-group">
									<label class="col-sm-1 control-label" for="材料4">材料4</label>
									<div class="col-sm-6">
										<input class="form-control" name="materials[3].materialName" type="text" placeholder="请输入材料名"/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-1 control-label" for="材料6">材料5</label>
									<div class="col-sm-6">
										<input class="form-control" name="materials[4].materialName" type="text" placeholder="请输入材料名"/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-1 control-label" for="材料6">材料6</label>
									<div class="col-sm-6">
										<input class="form-control" name="materials[5].materialName" type="text" placeholder="请输入材料名"/>
									</div>
								</div>
							</div>
						</div>
						<div class="accordion-heading">
							<br/>
							<a class="accordion-toggle btn btn-default" data-toggle="collapse"
								data-parent="#accordion" href="#moreMaterials">更多材料</a>
						</div>
					</div>
					
					<br/>
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