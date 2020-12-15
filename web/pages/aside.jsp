<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p><security:authentication property="principal.username"></security:authentication></p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>
		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/main.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>
			<%--只有管理员才能看的到--%>
			<security:authorize access="hasAnyRole('ADMIN')">
			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>系统管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
					</span>
			</a>
				<ul class="treeview-menu">
					<li id="user-setting"><a
						href="${pageContext.request.contextPath}/user/user-list.do?pageNum=1&pageSize=10&username="> <i
							class="fa fa-circle-o"></i> 用户管理
					</a></li>
					<li id="role-setting"><a
						href="${pageContext.request.contextPath}/role/role-list.do?pageNum=1&username="> <i
							class="fa fa-circle-o"></i> 角色管理
					</a></li>
				</ul>
			</li>
			</security:authorize>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
					<span>招聘信息</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-zwfb"><a
						href="${pageContext.request.contextPath}/position-offer/position-offer-list.do">
							<i class="fa fa-circle-o"></i> 职位发布
					</a></li>
					<li id="system-zwsq"><a
						href="${pageContext.request.contextPath}/position/position-list.do"> <i
							class="fa fa-circle-o"></i> 职位申请
					</a></li>
				</ul></li>
		</ul>
	</section>
</aside>