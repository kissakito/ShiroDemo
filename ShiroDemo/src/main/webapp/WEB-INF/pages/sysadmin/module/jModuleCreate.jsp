<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	<li id="new"><a href="#" onclick="formSubmit('saveModule','_self');this.blur();">提交</a></li>
	<li id="back"><a href="#" onclick="window.history.go(-1);this.blur();">返回</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    模块新增
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<tbody class="tableBody" >
	<tr class="odd">
		<td>上级模块</td>
		<td>
			<select name="parentModule.moduleId" style="width:127px;text-align: center">
				<option value="">---请选择---</option>
				<c:forEach items="${list}" var="m">
					<option value="${m.moduleId}">${m.name}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr class="odd">
		<td>模块类型</td>
		<td>
			<select name="ctype" style="width:127px;text-align: center">
				<option value="">---请选择---</option>
				<option value="1">主菜单</option>
				<option value="2">左侧菜单</option>
				<option value="3">按钮</option>
			</select>
		</td>
	</tr>
	<tr class="odd">
		<td>权限标识</td>
		<td><input type="text" name="name" /></td>
	</tr>
	<tr class="odd">
		<td>排序号</td>
		<td><input type="text" name="orderNo" /></td>
	</tr>
	<tr class="odd">
		<td>备注信息</td>
		<td><textarea name="remark" style="height:150px;width:100%"></textarea></td>
	</tr>
	</tbody>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

