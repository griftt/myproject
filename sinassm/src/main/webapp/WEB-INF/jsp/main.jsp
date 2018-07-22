<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title></title>
<script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../layui/layui.js"></script>

<script type="text/javascript" src="../js/turn.js"></script>
<link rel="stylesheet" href="../layui/css/layui.css" />
<link rel="stylesheet" href="../css/main.css" />
 <script src="../js/date-format.js" type="text/javascript" charset="utf-8"></script>

</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">layui 后台布局</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item" id="control"><a >控制台</a></li>
				<li class="layui-nav-item" id="userAdmin2"><a>用户管理</a></li>
				<li class="layui-nav-item" id="userAdmin" ><a style="display:none;">用户管理</a></li>
				<li class="layui-nav-item" id="wei"><a>微博管理</a></li>
				<li class="layui-nav-item" ><a href="javascript:;">审核系统</a>
					<dl class="layui-nav-child">
						<dd>
							<a >邮件管理</a>
						</dd>
						<dd>
							<a  id="message">消息管理</a>
						</dd>
						<dd>
							<a id="empower">授权管理</a>
						</dd>
					</dl></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a> <img src
							="http://t.cn/RCzsdCq" class="layui-nav-img"> ${admin.name}  </a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
						<dd>
							<a id="createAdmin">创建管理员</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="/sinassm/adminLogin/loginOut.action">退出</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-shrink="all"
					lay-filter="test">
					<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:;">所有商品</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">列表一</a>
							</dd>
							<dd>
								<a href="javascript:;">列表二</a>
							</dd>
							<dd>
								<a href="javascript:;">列表三</a>
							</dd>
							<dd>
								<a href="">超链接</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">解决方案</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">列表一</a>
							</dd>
							<dd>
								<a href="javascript:;">列表二</a>
							</dd>
							<dd>
								<a href="">超链接</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="">云市场</a></li>
					<li class="layui-nav-item"><a href="">发布商品</a></li>
				</ul>
			</div>
		</div>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div class="box">
				<div style="padding: 15px;" class="users page">
					<div class="search">
						<input type="text" name="title" required lay-verify="required"
							id="sea" placeholder="请输入账号" value="" class="layui-input">
						<!-- 搜索框 -->
						<div>
							<button class="layui-btn">
								<i class="layui-icon layui-icon-search"
									style="font-size: 30px; color: white;"></i>
							</button>
						</div>
					</div>
					<table class="layui-table" lay-filter="test" id="demo">
					</table>
				</div>
				<div id="userpage" class="userdetail page">
					<div class="user">
						<form class="layui-form" action="">
							<div class="layui-form-item layui-form-text">
								<label class="layui-form-label">头像</label>
								<div class="layui-input-block">
									<img src="../layui/css/modules/layer/default/loading-0.gif" />
								</div>
							</div>
							<div class="layui-form-item">
								<label class="layui-form-label">用户昵称</label>
								<div class="layui-input-block">
									<div class="size">
										<input type="text" name="title" required lay-verify="required"
											placeholder="请输入标题" autocomplete="off" class="layui-input">
									</div>
								</div>
							</div>
							<div class="layui-form-item">
								<label class="layui-form-label">账号：</label>
								<p></p>
							</div>
							<div class="layui-form-item">
								<label class="layui-form-label">地区：</label>
								<p></p>
							</div>
							<div class="layui-form-item">
								<label class="layui-form-label">生日：</label>
								<p></p>
							</div>
							<div class="layui-form-item">
								<label class="layui-form-label">性别：</label>
								<p></p>
							</div>

							<div class="layui-form-item layui-form-text">
								<label class="layui-form-label">标语</label>
								<div class="layui-input-block">
									<div class="size2">
										<textarea name="desc" placeholder="请输入内容"
											class="layui-textarea"></textarea>
									</div>
								</div>
							</div>

							<div class="layui-form-item">
								<div class="layui-input-block">
									<button class="layui-btn" lay-submit lay-filter="formDemo">返回</button>

								</div>
							</div>
						</form>

					</div>

				</div>
				<div class="adminpage page">
				   <div class="createAmdinForm">
						<div class="layui-form-item ">
							<label class="layui-form-label">名字</label>
							<div class="layui-input-block">
								<div class="size">
									<input type="text" id="adminName" required lay-verify="required"
										placeholder="请输入名字" autocomplete="off" class="layui-input">
								</div>
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">账号</label>
							<div class="layui-input-block">
								<div class="size">
									<input type="text" name="account" required lay-verify="required"
										placeholder="请输入账号" autocomplete="off" class="layui-input">
								</div>
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">密碼</label>
							<div class="layui-input-block">
								<div class="size">
									<input type="password" name="pwd" required id="in1"
										lay-verify="required" value="123456" lder="请输入密码"
										autocomplete="off" class="layui-input">
								</div>
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">请确认密碼</label>
							<div class="layui-input-block">
								<div class="size">
									<input type="password" name="title" required id="in2"
										lay-verify="required" value="123456" lder="请再次输入密码"
										autocomplete="off" class="layui-input">
								</div>
							</div>
						</div>
						<div class="layui-form-item layui-form">
   							 <label class="layui-form-label">选择角色</label>
    						<div class="layui-input-block size">
	     					  <select  lay-verify="required" name="roleId">
	        						<option value="0">請選擇</option>
	        						<option value="2">普通管理员</option>
	        						<option value="3">超级管理员</option>
	      					  </select>
	     
   							 </div>
  						</div>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" lay-submit lay-filter="formDemo" id="addAdmin">确认添加</button>
							</div>
						</div>
					
					</div>
				</div>
				<div class="weibo page">
				<form class="layui-form" action="">
					
					<div class="layui-form-item">
						<label class="layui-form-label">开关</label>
						<div class="layui-input-block">
							<input type="checkbox" name="switch" lay-skin="switch">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">weibo ID</label>
						<div class="layui-input-block">
							<div class="size">
								<input type="text" name="title" required lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
							</div>
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">输入框</label>
						<div class="layui-input-block">
							<div class="size">
								<input type="text" name="title" required lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
							</div>
						</div>
					</div>
					<div class="layui-form-item layui-form-text">
						<label class="layui-form-label">文本域</label>
						<div class="layui-input-block">
							<div class="size2">
								<textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
							</div>
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">图片</label>
						<div class="layui-input-block">
							<div class="size2">
								<textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
							</div>
						</div>
						
					</div>
					<div class="layui-form-item">
						<div class="layui-input-block">
							<button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
							<button type="reset" class="layui-btn layui-btn-primary">重置</button>
						</div>
					</div>
					
				</form>

			</div>
				<div class="showWeibo page">
					<table class="layui-table" lay-filter="weibo" id="weibotable">
					</table>
				</div>
				<div class="showUserFriend page">
					<table class="layui-table" lay-filter="userFriend" id="friendtable">
					</table>
				</div>
				<div class="layui-footer">
					
					<!-- 底部固定区域 -->
					© layui.com - 底部固定区域
				</div>
			</div>
		</div>

<script type="text/html" id="barDemo">
<div style="background:red;">
<a  class="layui-btn layui-btn-mini" lay-event="userFriend" id="showUserFriend" >用户好友</a>
 <a  class="layui-btn layui-btn-mini" lay-event="weiboUser" id="userWeibo">用户微博</a>
  <a class="layui-btn layui-btn-mini" lay-event="editUser">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="delUser">删除</a>
</div>
</script>
<!-- admin的操作栏 -->
<script type="text/html" id="adminBar">
    <a class="layui-btn layui-btn-mini" lay-event="editAdmin" >编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="delAdmin">删除</a>
</script>
<!-- weibo的操作栏 -->
<script type="text/html" id="weiboBar">
 	<a class="layui-btn  layui-btn-mini" lay-event="weiboContent">查看评论</a>
    <a class="layui-btn layui-btn-mini" lay-event="editWeibo" >编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="delWeibo">删除</a>
</script>
<!-- weibo评论的操作栏 -->
<script type="text/html" id="WeiboContentBar">
    <a class="layui-btn layui-btn-mini" lay-event="editContent" >编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="delContent">删除</a>
</script>
<!-- 用户好友的操作栏 -->
<script type="text/html" id="friendBar">
	
    <a class="layui-btn layui-btn-mini" lay-event="editFriend" >编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="delFriend">删除</a>
</script>
</body>

	<!-- 时间格式转换 --> 
    <script id="mytime" type="text/html">
    {{#   
    var date = new Date();
    date.setTime(d.time);
    return date.Format("yyyy-MM-dd hh:mm:ss"); 
    }} 
    </script>
	
</html>

