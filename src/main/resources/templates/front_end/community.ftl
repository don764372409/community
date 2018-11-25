<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>源码社区</title>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<style type="text/css">
	body{
		padding: 0;
		margin: 0;
	}
	.navbar{
		position: fixed;
		width: 100%;
	}
	.main .left{
		width: 150px;
		margin-top:60px;
		margin-left: 20px;
		display: inline-block;
		height:650px;
		position: fixed;
	}
	.main .left .panel > div {
		border-bottom: 1px solid #337ab7;
	}
	.main .left .panel:last-child {
		border-bottom: 0;
	}
	.main .left .panel .active{
		background-color: #0066cc;
		color:white;
	}
	.main .right{
		display: inline-block;
		margin-left: 190px;
		margin-top:60px;
		width: calc( 100% - 190px);
	}
	.right ul{
		list-style: none;
		padding-left: 0px;
	}
	.right ul li{
		width: calc(33% - 15px);
		margin-left:15px;
		display: inline-block;
		height: 150px;
		height: 180px;
	}
	.right ul li .panel-body{
		height:120px;
	}
	a:hover{
		text-decoration: none;
	}
	.breadcrumb{
		padding:0;
		margin:0;
		background:#337ab7;
	}
</style>
</head>
<body>
	<nav class="navbar navbar-default">
  <div class="container-fluid"  data-toggle="collapse">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <a class="navbar-brand" href="#">LOGO</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">教程专区 <span class="sr-only">(current)</span></a></li>
        <li><a href="#">源码社区 <span class="sr-only">(current)</span></a></li>
        <li><a href="#">招聘专区</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">企业解决方案 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">U3D游戏开发</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">移动APP开发</a></li>
            <li><a href="#">公众号/小程序开发</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">企业网站/交互平台</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">其他</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="输入关键字查询">
        </div>
        <button type="submit" class="btn btn-default">查询</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#" style="color:red">QQ群:836963971</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">登录/注册 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">登录账号</a></li>
            <li><a href="#">注册账号</a></li>
            <li><a href="#">个人消息(0)</a></li>
            <li><a href="#">个人中心</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">注销账号</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
  <div class="main">
  	<div class="left">
  		<div class="panel panel-primary">
		  <div class="panel-heading">教程目录</div>
		  <a href="#"><div class="panel-body">JAVA基础</div></a>
		  <div class="panel-body active">JAVA基础</div>
		</div>
  	</div>
  	<div class="right">
  		<div class="panel panel-primary">
		  <div class="panel-heading">
			   <ol class="breadcrumb">
				  <li><a href="#" style="color:#ff6600">JAVA基础(1级目录)</a></li>
				  <li><a href="#" style="color:pink">运算符(2级目录)</a></li>
				  <li class="active" style="color:#333">算术运算符(当前知识点章节,默认选中第一个章节)</li>
				</ol>
		 </div>
		  <div class="panel-body">
		  		教程内容	
		  </div>
 	 	</div>	
  		<div class="panel panel-primary">
		  <div class="panel-heading">
			   <ol class="breadcrumb">
				  <li><a href="#" style="color:#ff6600">JAVA基础(1级目录)</a></li>
				  <li><a href="#" style="color:pink">运算符(2级目录)</a></li>
				  <li class="active" style="color:#333">比较运算符</li>
				</ol>
		 </div>
		  <div class="panel-body">
		  		教程内容	
		  </div>
 	 	</div>	
  		<div class="panel panel-info">
			 <div class="panel-heading">友情提示</div>
			<div class="panel-body">
			 		教程内容	
			 </div>
 	 	</div>	
  		<div class="panel panel-danger">
			 <div class="panel-heading">作业专区</div>
			<div class="panel-body">
			 		教程内容	
			 </div>
 	 	</div>	
  		<div class="panel panel-warning">
			 <div class="panel-heading">评论专区</div>
			<div class="panel-body">
			 		教程内容	
			 </div>
 	 	</div>	
	</div>
</div>
<footer>
	
</footer>
</body>
</html>