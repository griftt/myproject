<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>微博登录框效果</title>
  

<link rel="stylesheet" href="css/iconfont.css" />
<style type="text/css">
* {
	padding: 0;
	outline: none;
}

.box {
	width: 100%;
	height: 1000px;
	background-color: #f2f2f5;
	padding: 0.1px;
}

.box form {
	height: 300px;
	width: 500px;
	margin: 100px auto;
	background-color: rgba(254,254,254,.4);
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
	position: relative;
}

form .one .fir {
	height: 26px;
	width: 35px;
	position: absolute;
	display: inline-block;
	vertical-align: middle;
	padding-top: 3px;
	
}

form .one input {
	font-size: 14px;
	height: 31px;
	width: 230px;
	vertical-align: middle;
	border:1px solid #cccccc;
	padding-left: 40px;
	letter-spacing: 2px;
	border-radius: 2px;
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

form p:last-of-type {
	padding-top: 20px;
}

form .login {
	height: 33px;
	width: 271px;
	background-color:#ff8140; 
	border:none;
	border-radius:3px ;
	font-size: 16px;
	color: white;
}

.iconfont {
	font-size: 20px;
	color: gray;
	margin-top: 3px;
}
.reg{width: 200px; height:15px;color:#808080;margin-left: 74px;font-size: 12px;}
.reg a{color: #FF8140;cursor: pointer;}
</style>
</head>
<body>
	<div class="box">
		<form action="/sinassm/user/userLogin.action" method="post">

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

			
			<p class="r">
				<input type="checkbox"  id="rem" /><span>记住密码</span>
			</p>
			<p>
				<input type="submit" value="登录" class="login" />
			</p>
			<div class="reg"><span>还没有微博?</span><a>立即注册</a> </div>
		</form>

	</div>
	

    	
    	
    </div>
    
</body>
</html>