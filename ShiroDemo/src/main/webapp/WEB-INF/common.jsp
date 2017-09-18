<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>
<div
	class="navbar navbar-default navbar-fixed-top navbar-transparent-black mm-fixed-top"
	role="navigation" id="navbar">



	<!-- Branding -->
	<div class="navbar-header col-md-2">
		<a class="navbar-brand" href="login.action"> <strong>Shiro</strong>Demo
		</a>
		<div class="sidebar-collapse" style="margin-top:13px;">
			<a href="#"> <i class="fa fa-bars"></i>
			</a>
		</div>
	</div>
	<!-- Branding end -->


	<!-- .nav-collapse -->
	<div class="navbar-collapse">

		<!-- Page refresh -->
		<ul class="nav navbar-nav refresh" style="margin-top:15px;">
			<li class="divided"><a href="#" class="page-refresh"><i
					class="fa fa-refresh"></i></a></li>
		</ul>
		<!-- /Page refresh -->

		<!-- Search -->
		<!-- <div class="search" id="main-search">
						<i class="fa fa-search"></i> <input type="text"
							placeholder="Search...">
					</div> -->
		<!-- Search end -->

		<!-- Quick Actions -->
		<ul class="nav navbar-nav quick-actions">
			<li class="dropdown divided user" id="current-user">
				<div class="profile-photo">
					<!-- <img src="assets/images/profile-photo.jpg" alt /> -->
				</div> <a class="dropdown-toggle options" data-toggle="dropdown" href="#">
					${sessionScope.user.username}<i class="fa fa-caret-down"></i>
			</a>

				<ul class="dropdown-menu arrow settings" style="left:-45px;">

					<li>

						<h3>Backgrounds:</h3>
						<ul id="color-schemes">
							<li><a href="#" class="bg-1"></a></li>
							<li><a href="#" class="bg-2"></a></li>
							<li><a href="#" class="bg-3"></a></li>
							<li><a href="#" class="bg-4"></a></li>
							<li><a href="#" class="bg-5"></a></li>
							<li><a href="#" class="bg-6"></a></li>
						</ul>
					</li>

					<li class="divider"></li>
					<!-- 
								<li><a href="#"><i class="fa fa-user"></i> Profile</a></li>

								<li><a href="#"><i class="fa fa-calendar"></i> Calendar</a>
								</li>

								<li><a href="#"><i class="fa fa-envelope"></i> Inbox <span
										class="badge badge-red" id="user-inbox">3</span></a></li>

								<li class="divider"></li> -->

					<li><a href="/validate/loginOut"><i class="fa fa-power-off"></i>
							Logout</a></li>
				</ul>
			</li>
		</ul>
		<!-- /Quick Actions -->



		<!-- Sidebar -->
		<ul class="nav navbar-nav side-nav" id="sidebar">

			<li class="collapsed-content">
				<ul>
					<li class="search">
						<!-- Collapsed search pasting here at 768px -->
					</li>
				</ul>
			</li>

			<li class="navigation" id="navigation"><a href="#"
				class="sidebar-toggle" data-toggle="#navigation">导航栏 <i
					class="fa fa-angle-up"></i></a>

				<ul class="menu">
					<shiro:hasPermission name="系统首页">
						<li class="active"><a href="login.action"> <i
								class="fa fa-tachometer"></i> 系统首页 <!-- <span class="badge badge-red">1</span> -->
						</a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="业务处理">
						<li class="dropdown"><a href="toUserManagement.action"
							class="dropdown-toggle" data-toggle=""> <i class="fa fa-list"></i>
								业务处理
						</a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="基础信息">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-pencil"></i> 基础信息 <!-- <b class="fa fa-plus dropdown-plus"></b> -->
						</a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="统计分析">
						<li class="dropdown"><a href="toProductManageJsp.action"
							class="dropdown-toggle" data-toggle=""> <i
								class="fa fa-th-large"></i> 统计分析<!--  <b class="fa fa-plus dropdown-plus"></b> -->
						</a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="系统管理">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-desktop"></i> 系统管理
							 <b class="fa fa-plus dropdown-plus"></b> <!-- <span
										class="label label-greensea">mails</span> -->
						</a>
							<ul class="dropdown-menu">
								<li><a href="login.html"> <i class="fa fa-caret-right"></i>
										部门管理
								</a></li>
								<li><a href="calendar.html"> <i
										class="fa fa-caret-right"></i> 用户管理
								</a></li>
								<li><a href="page404.html"> <i
										class="fa fa-caret-right"></i> 角色管理
								</a></li>
								<li><a href="page500.html"> <i
										class="fa fa-caret-right"></i> 模块管理
								</a></li>
							</ul></li>
					</shiro:hasPermission>

				</ul></li>
	</div>
	<!--/.nav-collapse -->


</div>