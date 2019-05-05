<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href=${pageContext.request.contextPath}/css/default.css
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href=${pageContext.request.contextPath}/js/easyui/themes/default/easyui.css />
<link rel="stylesheet" type="text/css"
	href=${pageContext.request.contextPath}/js/easyui/themes/icon.css />
<script type="text/javascript"
	src=${pageContext.request.contextPath}/js/easyui/jquery.min.js></script>
<script type="text/javascript"
	src=${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js></script>
<script type="text/javascript"
	src=${pageContext.request.contextPath}/js/easyui/locale/easyui-lang-zh_CN.js></script>



<!-- <div id="tab-toolbar">
		<table cellpadding="10">
			<tr>
				<td>学生名称：<input class="easyui-textbox" name="name" id="nameSS"></td>
				<td>跟踪者：<select id="userId2SS" class="easyui-combobox" name="userId2" style="width:150px;">   
						    <option></option>   
						    <option>bitem2</option>   
						    <option>bitem3</option>  
						</select>  
				</td>
				<td>跟踪开始时间：<input class= "easyui-datebox" name="creatTime" id="creatTimeMINSS">-<input class= "easyui-datebox" name="creatTime" id="creatTimeMAXSS"></td>
			</tr>
			<tr>
				<td>回访情况：<input class="easyui-textbox" name="remark" id="remarkSS"></td>回访情况
				<td>跟踪方式：<input class="easyui-textbox" name="p_name" id="p_nameSS"></td>
				<td><span class="easyui-linkbutton" iconCls="icon-search" onclick="search()">搜索</span>&nbsp;&nbsp;
					<span class="easyui-menubutton" data-options="menu:'#mm',iconCls:'icon-edit'">更多操作</span>
					<div id="mm" style="width: 150px;">
						<div data-options="iconCls:'icon-remove'" onclick="deletes()">批量删除</div>
					</div>
				</td>
			</tr>
		</table>
	</div> -->
<style type="text/css">
.easyui-textbox {
	height: 30px;
}
</style>

</head>
<body>
	<%-- 数据表格 --%>
	<table id="tab"></table>
	<%-- 数据表格-工具条 --%>
	<div id="tab-toolbar">
		<table cellpadding="10">
			<tr>
				<td>姓名：<input class="easyui-textbox" name="name" id="nameSS"></td>
				<td>电话：<input class="easyui-textbox" name="phone" id="phoneSS"></td>
				<td>咨询师：<select id="userId2SS" class="easyui-combobox"
					name="userId2" style="width: 150px;">
						<option></option>
						<option>bitem2</option>
						<option>bitem3</option>
				</select>
				</td>
				<td>是否缴费：<select id="isPaySS" class="easyui-combobox"
					name="isPay" style="width: 100px;">
						<option value="">全部</option>
						<option value="1">是</option>
						<option value="0">否</option>
				</select>
				</td>
				<td>是否有效：<select id="isEffectiveSS" class="easyui-combobox"
					name="isEffective" style="width: 100px;">
						<option value="">全部</option>
						<option value="1">是</option>
						<option value="0">否</option>
				</select>
				</td>
				<td>回访情况：<select id="remarkSS" class="easyui-combobox"
					name="remark" style="width: 100px;">
						<option value="">全部</option>
						<option value="1">是</option>
						<option value="0">否</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>QQ：<input class="easyui-textbox" name="qq" id="qqSS"></td>
				<td colspan="2"><select class="easyui-combobox" id="dateTypeSS"
					name="dateType" style="width: 120px;">
						<option value="1">创建时间</option>
						<option value="2">第一次访问时间</option>
						<option value="3">上门时间</option>
				</select> <input class="easyui-datebox" name="creatTime" id="dateMINSS">-<input
					class="easyui-datebox" name="creatTime" id="dateMAXSS"></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;<span class="easyui-linkbutton"
					iconCls="icon-search" onclick="search()">搜索</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span
					class="easyui-linkbutton" iconCls="icon-add" onclick="add()">添加</span>
				</td>
				<td>
			<span class="easyui-menubutton"
					data-options="menu:'#mm',iconCls:'icon-edit'">更多操作</span>
				<div id="mm" style="width: 150px;">
					<div data-options="iconCls:'icon-remove'" onclick="deletes()">批量删除</div>
					<div data-options="iconCls:'icon-filter'" onclick="fenpeis()">批量分配</div>
				</div>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="javascript:void(0);" id="btnExport"
					class="easyui-linkbutton" iconCls='icon-print'>导出Excel</a>
				</td></tr>
			<tr>
				<td><span class="easyui-linkbutton" iconCls="icon-cut"
					onclick="dongtai()">动态显示列</span></td>
			</tr>
		</table>
	</div>
	<%-- 批量分配窗口 --%>
	<div class="easyui-window"
		data-options="iconCls:'icon-save',closed:true,width:350,height:320"
		id="win-fenpei" title="批量分配">
		<%-- 修改-form表单 --%>
		<form id="form-update">
			<table cellpadding="10">
				<tr>
					<td><table id="tab-fenpei" width="128"></table></td>
					<td><select id="ccc" class="easyui-combobox"
						style="width: 100px"></select></td>
				</tr>
			</table>
		</form>
	</div>

</body>
<!-- 创建时间、学员姓名、学员电话、性别、年龄、
学历、个人状态、来源渠道、来源网址、来源关键词、姓名（咨询）、
所在区域、微信、学员QQ、来源部门、是否报备、课程方向、是否有效、
打分、是否回访、首次回访时间、是否上门、上门时间、无效原因、是否缴费、缴费时间、金额、
是否退费、是否进班、进班时间、进班备注、退费原因、定金金额、定金时间 -->
<!-- 数据表格+搜索 -->
<script type="text/javascript">
	$(function() {
		paging();
	});
	var columns = [ [
			{
				field : 'xz',
				checkbox : true
			},
			{
				field : 'studentId',
				title : 'ID',
				hidden : true,
				align : 'center'
			},
			{
				field : 'name',
				title : '姓名'
			},
			{
				field : 'age',
				title : '年龄'
			},
			{
				field : 'phone',
				title : '手机号'
			},
			{
				field : 'education',
				title : '学历'
			},
			{
				field : 'state',
				title : '个人状态'
			},
			{
				field : 'sources',
				title : '来源渠道'
			},
			{
				field : 'sourceSite',
				title : '来源网址'
			},
			{
				field : 'sourcekeyword',
				title : '来源关键词'
			},
			{
				field : 'qq',
				title : '学员QQ'
			},
			{
				field : 'weChat',
				title : '微信'
			},
			{
				field : 'cz',
				title : '操作',
				formatter : function(value, row, index) {
					return "<span onclick='update(" + index
							+ ")'>修改</span>&nbsp;&nbsp;"
							+ "<span onclick='del(" + index + ")'>删除</span>";
				}
			} ] ];
	function paging() {
		$("#tab").datagrid({
			url : "pageData",
			title : "跟踪信息",
			method : "post",
			toolbar : "#tab-toolbar",
			pagination : true,
			columns : columns
		});
	}
	function search() {
		$("#tab").datagrid("load", {
			name : $("#nameSS").val(),
			phone : $("#phoneSS").val(),
			userId2 : $("#userId2SS").combobox("getValue"),
			isPay : $("#isPaySS").combobox("getValue"),
			isEffective : $("#isEffectiveSS").combobox("getValue"),
			remark : $("#remarkSS").combobox("getValue"),
			qq : $("#qqSS").val(),
			dateType : $("#dateTypeSS").val(),
			creatTime : $("#dateMINSS").val(),
			firstVisitTime : $("#dateMAXSS").val(),
		});
	}
	function dongtai() {
		var html = "";
		for (var i = 0; i < columns[0].length; i++) {
			if (columns[0][i].hidden !== true) {
				html += columns[0][i].title + ",";
			}
		}
		alert(html);
		dialog = ezg.modalDialog({
			width : 650,
			height : 370,
			title : '房屋查询报表列属性设置',
			url : '/Report/ColumnProperties?Column=' + html
		});
	}
</script>
<!-- 批量分配 -->
<script type="text/javascript">
	function fenpeis() {
		var row = $("#tab").datagrid("getSelections");
		var ids = "";
		if (row.length > 0) {
			for (var i = 0; i < row.length; i++) {
				ids += row[i].studentId;
				if (row.length - 1 != i) {
					ids += ","
				}
			}
		} else {
			$.messager.alert("系统信息", "请选择数据");
			return;
		}
		$("#tab-fenpei").datagrid({
			url : "fenpeis",
			title : "学生分配信息",
			method : "post",
			queryParams : {
				ids : ids
			},
			columns : [ [ {
				field : 'name',
				title : '学生名字'
			}, {
				field : 'phone',
				title : '咨询师'
			} ] ]
		});
		$("#win-fenpei").window("open");
	}
	$('#ccc').combobox({
		url : '../user/selectZiXunShis',
		valueField : 'userId',
		textField : 'loginName',
		onSelect : function(rec) {
			var row = $("#tab-fenpei").datagrid("getRows");
			var ids = "";
			for (var i = 0; i < row.length; i++) {
				ids += row[i].studentId;
				if (row.length - 1 != i) {
					ids += ","
				}
			}
			$.post("updatefenpeis", {
				ids : ids,
				userId : rec.userId
			}, function(res) {
				if (res > 1) {
					$.messager.alert("系统信息", "批量分配成功");
				} else {
					$.messager.alert("系统信息", "未知错误");
				}
				$("#win-fenpei").window("close");
				$("#tab").datagrid("reload"); //通过调用reload方法，让datagrid刷新显示数据
			});
		}
	});
</script>
<!-- 查 改 删 批删 -->
<script type="text/javascript">
	function update(index) {
		var row = $("#tab").datagrid("getData").rows[index];
		$("#form-update").form("load", row);
		$("#win-update").window("open");
	}

	function submitUpdate() {
		if (!isNaN($("#t_type-update").combobox("getValue"))) {//用户修改下拉框则id传给t_type
			$("#t_id-update").val($("#t_type-update").combobox("getValue"));
		}
		$.post("updateOrAdd.do", $("#form-update").serializeArray(), function(
				res) {
			if (res) {
				$.messager.alert("系统信息", "修改成功");
				$("#win-update").window("close");
				$("#tab").datagrid("reload"); //通过调用reload方法，让datagrid刷新显示数据
			}
		}, "json");
	}
	function add() {
		$("#win-add").window("open");
	}
	function submitAdd() {
		var data = $("#form-add").serializeArray();//获取form表单数据
		data.push({
			"name" : "t_id",
			"value" : $("#t_type-add").combobox("getValue")
		});
		$.post("updateOrAdd.do", data, function(res) {
			if (res) {
				$.messager.alert("系统信息", "添加成功");
				$("#win-add").window("close");
				$("#tab").datagrid("reload"); //通过调用reload方法，让datagrid刷新显示数据
			}
		}, "json");
	}

	function del(index) {
		var row = $("#tab").datagrid("getData").rows[index];
		$.post("delete", {
			studentId : row.studentId
		}, function(res) {
			if (res > 0) {
				$.messager.alert("系统信息", "删除成功");
				$("#tab").datagrid("reload"); //通过调用reload方法，让datagrid刷新显示数据
			} else {
				$.messager.alert("系统信息", "删除失败");
			}
		});
	}

	function deletes() {
		var row = $("#tab").datagrid("getSelections");
		var ids = "";
		if (row.length > 0) {
			for (var i = 0; i < row.length; i++) {
				ids += row[i].studentId;
				if (row.length - 1 != i) {
					ids += ","
				}
			}
		} else {
			$.messager.alert("系统信息", "请选择数据");
			return;
		}
		$.post("deletes", {
			ids : ids
		}, function(res) {
			if (res > 0) {
				$.messager.alert("系统信息", "删除成功");
				$("#tab").datagrid("reload"); //通过调用reload方法，让datagrid刷新显示数据
			} else {
				$.messager.alert("系统信息", "删除失败");
			}
		});
	}
	$(document).ready(function() {
		queryXzqh();
	});

	function queryXzqh() {
		$("#t_type-update").combobox({
			url : "productType/list.do",//获取数据
			method : "post",
			valueField : 't_id',
			textField : 't_type'
		});
		$("#t_type-add").combobox({
			url : "productType/list.do",//获取数据
			method : "post",
			valueField : 't_id',
			textField : 't_type'
		});
	}
</script>
<!-- 导出Exc表格 -->
<script type="text/javascript">
	function JSONToCSVConvertor(JSONData, ReportTitle, ShowLabel) {
		//如果jsondata不是对象，那么json.parse将分析对象中的json字符串。
		var arrData = typeof JSONData != 'object' ? JSON.parse(JSONData)
				: JSONData;
		var CSV = '';

		//在第一行拼接标题
		CSV += ReportTitle + '\r\n\n';

		//产生数据标头
		if (ShowLabel) {
			var row = "";
			//此循环将从数组的第一个索引中提取标签
			for ( var index in arrData[0]) {

				//现在将每个值转换为字符串和逗号分隔
				row += index + ',';
			}

			row = row.slice(0, -1);

			//添加带换行符的标签行
			CSV += row + '\r\n';
		}

		//第一个循环是提取每一行
		for (var i = 0; i < arrData.length; i++) {
			var row = "";

			//2nd loop will extract each column and convert it in string comma-seprated
			for ( var index in arrData[i]) {
				row += '"' + arrData[i][index] + '",';
			}

			row.slice(0, row.length - 1);

			//add a line break after each row
			CSV += row + '\r\n';
		}

		if (CSV == '') {
			alert("Invalid data");
			return;
		}

		//Generate a file name
		var fileName = "我的学生_";
		//this will remove the blank-spaces from the title and replace it with an underscore
		fileName += ReportTitle.replace(/ /g, "_");

		//Initialize file format you want csv or xls
		//var uri = 'data:text/csv;charset=utf-8,' + escape(CSV);
		var uri = 'data:text/csv;charset=utf-8,\ufeff' + encodeURI(CSV);

		// Now the little tricky part.
		// you can use either>> window.open(uri);
		// but this will not work in some browsers
		// or you will not get the correct file extension    

		//this trick will generate a temp <a /> tag
		var link = document.createElement("a");
		link.href = uri;

		//set the visibility hidden so it will not effect on your web-layout
		link.style = "visibility:hidden";
		link.download = fileName + ".csv";

		//this part will append the anchor tag and remove it after automatic click
		document.body.appendChild(link);
		link.click();
		document.body.removeChild(link);
	}

	$("#btnExport").click(function() {
		var data = JSON.stringify($('#tab').datagrid('getData').rows);
		if (data == '')
			return;

		JSONToCSVConvertor(data, "数据信息", true);
	});
</script>
</html>