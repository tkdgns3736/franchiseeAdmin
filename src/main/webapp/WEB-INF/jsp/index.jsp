<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/include/setting.jsp"/>

<script type="text/javascript">

	function login(){
		
		 $.ajax({
	            url : "api/login/request",
	            type : 'POST', 
	            data : $("#loginForm").serialize(), 
	            success : function(result, status, xhr) {
	            	console.log(xhr.getResponseHeader('X-PINP-STATUS'));
	            	
	            	if(xhr.getResponseHeader('X-PINP-STATUS')=="0000")
	            		location.href = 'page/management/monthTradeInfo';
	            	
	            	else
	            		alert("로그인 실패"); 
	            },
	            error : function(xhr, status) {
	                alert(xhr + " : " + status);
	            }
	        });
	}
		
	
</script>
    <body class="bg-primary">
        <div id="layoutAuthentication">
            <div id="layoutAuthentication_content" style="background-color: dimgrey;">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-5">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">로그인</h3></div>
                                    <div class="card-body">
                                        <form id="loginForm" method="POST">
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="userId" name="userId" type="text"/>
                                                <label for="inputEmail">아이디</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="userPw" name="userPw" type="password" placeholder="Password" />
                                                <label for="inputPassword">비밀번호</label>
                                            </div>
                                            <div class="form-check mb-3">
                                                <input class="form-check-input" id="inputRememberPassword" type="checkbox" value="" />
                                                <label class="form-check-label" for="inputRememberPassword">아이디 저장</label>
                                            </div>
                                            <div class="d-flex align-items-center justify-content-between mt-4 mb-0" style="float:right;">    
                                                <a class="btn btn-primary" href="#" onclick="login();">로그인</a>
                                                
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
            <div id="layoutAuthentication_footer">
               <jsp:include page="/WEB-INF/jsp/layout/footerLayout.jsp"/>
            </div>
        </div>  
    </body>
</html>
