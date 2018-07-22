<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script type="text/javascript" src="/sinassm/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/sinassm/layui/layui.js"></script>
<link rel="stylesheet" href="/sinassm/layui/css/layui.css" />
<script type="text/javascript" src="/sinassm/js/iconfont.js"></script>
<link rel="stylesheet" href="/sinassm/css/iconfont.css" />
<style type="text/css">
* {
	padding: 0;
	outline: none;
}

.box {
	width: 100%;
	height: 1000px;
	background-color: #daecee;
	padding: 0.1px;
}

.box form {
	height: 400px;
	width: 600px;
	margin: 100px auto;
	background-color: #daecee;
	padding-top: 25px;
	text-align: center;
}

form p:nth-child(1)>img {
	border-radius: 50%;
	width: 100px;
	height: 100px;
}

form .one {
	font-size: 0;
	margin-top: 20px;
}

form .one .fir {
	height: 28px;
	width: 35px;
	background-color: #CCCCCC;
	display: inline-block;
	vertical-align: middle;
	padding-top: 3px;
}

form .one input {
	font-size: 14px;
	height: 31px;
	width: 230px;
	vertical-align: middle;
	border: none;
	padding-left: 8px;
	letter-spacing: 2px;
}

form .r {
	margin-top: 2px;
	margin-left: 191px;
	font-size: 14px;
	margin-bottom: 10px;
}

form .r input {
	vertical-align: middle;
	padding-left: 10px;
}

form .r span {
	vertical-align: middle;
}

form .code {
	width: 600px;
	margin-top: 15px;
}

form .code input {
	height: 29px;
	width: 159px;
	vertical-align: middle;
	margin-left: 69px !important;
	padding-left: 8px;
}

form .code img {
	height: 33px;
	width: 100px;
	vertical-align: middle;
	margin-right: 9px !important;
}

form .code span {
	width: 50px;
	opacity:0;
	color: red;
}

form p:last-of-type {
	padding-top: 30px;
}

form .login {
	height: 30px;
	width: 200px;
	
}

.iconfont {
	font-size: 20px;
	color: gray;
	margin-top: 3px;
}
</style>
</head>
<body>
	<div class="box">

		<form action="/sinassm/adminLogin/login.action" method="post">

			<p style="display: none;">
				<img src="../resources/images/bg-sidebar.gif" />
			</p>
			<div class="one">
				<div class="fir">
					<i class="iconfont icon-zhanghu"></i>
				</div>
				<input type="text" name="account" placeholder="请输入账号" />
			</div>
			<div class="one">
				<div class="fir">
					<i class="iconfont icon-zhanghuanquan"></i>
				</div>
				<input type="password" name="pwd" placeholder="请输入密码" />
			</div>

			<p class="code">
				<input type="text" placeholder="请输入验证码" class="inputCode" name="code" />
				<img src=" /sinassm/adminLogin/code.action" 
				onclick="this.src='/sinassm/adminLogin/code.action?a='+Math.random()" /><span>验证码有误</span>
			</p>
			<p class="r">
				<input type="checkbox"  id="rem" /><span>记住密码</span>
			</p>
			<p>
				<input type="submit" value="登录" class="login" />
			</p>
		</form>

	</div>
	

</body>
<!-- <script type="text/javascript">
	/* var code=<s:property value="#session.code"/> */
	
	
	var $login=$(".login");
	var m=function(){
		var $inputCode=$(".inputCode").val().toUpperCase();
		alert($inputCode)
		$.ajax({
			url:"/sinassm/adminLogin/login.action",
			type:"post",
			data:"inputCode="+$inputCode,
			dataType:"JSON",
			success:function(obj){
				alert(obj)
				if(obj){
					return true;
				}
				else{
					return false;
				}
			}
		
		})
		
	} 
</script> -->



</html>