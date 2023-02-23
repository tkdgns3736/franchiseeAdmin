<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script>
<%--로그아웃 --%>
function logout(){
	 $.ajax({
            url : "/api/logout/request",
            type : 'POST', 
            data : "", 
            async: false,
            success : function(result, status, xhr) {
            	if(xhr.getResponseHeader('X-PINP-STATUS')=="0000"){
            		alert("로그아웃 완료"); 
            		location.href = '/';
            	}
            	else
            		alert("로그아웃 실패"); 
            },
            error : function(xhr, status) {
                alert(xhr + " : " + status);
            }
        });
}
</script>

		<body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="page/management/monthTradeInfo">${currentMember.storeName}</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <ul class="navbar-nav ms-auto me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">${currentMember.userName}님 반갑습니다&nbsp;<i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <c:forEach var="user" items="${currentMember.menuList}">
	                        <c:if test="${user.menuGrp eq '003' and user.menuOrd ne '0'}">
	                       		<li><a class="dropdown-item" href="${user.menuUrl}">${user.menuNm}</a></li>
	                       		<li><hr class="dropdown-divider" /></li>
	                        </c:if>
                        </c:forEach>
                       	<li><a class="dropdown-item" onclick="logout();">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                         	
                         	
                         	<c:forEach var="menu" items="${currentMember.menuList}">
	                            <c:if test="${menu.menuOrd eq '0' and menu.menuGrp ne '003'}">
		                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts${menu.menuGrp}" aria-expanded="false" aria-controls="collapseLayouts${menu.menuGrp}">
		                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
		                                ${menu.menuNm}
		                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
		                            </a>
		                            <div class="collapse" id="collapseLayouts${menu.menuGrp}" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
		                                <nav class="sb-sidenav-menu-nested nav">
		                                	<c:forEach var="me" items="${currentMember.menuList}">
		                                	<c:if test="${menu.menuGrp eq me.menuGrp and me.menuOrd ne '0' }">
		                                    <a class="nav-link" href="${me.menuUrl}">${me.menuNm}</a>
		                                    </c:if>
		                                    </c:forEach>
		                                </nav>
		                            </div>
	                            </c:if>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <div class="small">환영합니다.</div>
                        핀플넷 가맹점 관리 페이지
                    </div>
                </nav>
            </div>