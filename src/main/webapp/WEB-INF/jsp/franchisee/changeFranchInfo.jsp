<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="/WEB-INF/jsp/include/setting.jsp"/>
     	 <jsp:include page="/WEB-INF/jsp/layout/topLayout.jsp"/>
	
            <div id="layoutSidenav_content">
                <main>
                   <div class="container-fluid px-4">
                    	<h2 class="mt-2">가맹점 정보변경</h2>	
                   </div>
                   <br> <br> <br> <br>
                   <div class="row justify-content-center" >
                    <div class="col-lg-10" style="border: 1px solid #adb5bd;">
                    <br>
                      	<form>
							  <div class="row mb-3">
							    <label for="inputEmail3" class="col-sm-2 col-form-label">전화번호</label>
							    <div class="col-sm-10">
							      <input type="email" class="form-control" id="inputEmail3">
							    </div>
							  </div>
							  <div class="row mb-3">
							    <label for="inputPassword3" class="col-sm-2 col-form-label">Fax</label>
							    <div class="col-sm-10">
							      <input type="password" class="form-control" id="inputPassword3">
							    </div>
							  </div>
							 <div class="row mb-3">
							    <label for="inputPassword3" class="col-sm-2 col-form-label">Email 주소</label>
							    <div class="col-sm-10">
							      <input type="password" class="form-control" id="inputPassword3">
							    </div>
							  </div>
							  <div class="row mb-3">
							    <label for="inputPassword3" class="col-sm-2 col-form-label">휴대폰번호</label>
							    <div class="col-sm-10">
							      <input type="password" class="form-control" id="inputPassword3">
							    </div>
							  </div>
							   <div class="row mb-3">
							    <label for="inputPassword3" class="col-sm-2 col-form-label">가맹점 주소</label>
							    <div class="col-sm-10">
							      <input type="password" class="form-control" id="inputPassword3">
							    </div>
							  </div>
							   <div class="row mb-3">
							    <label for="inputPassword3" class="col-sm-2 col-form-label">계좌번호</label>
							    <div class="col-sm-10">
							      <input type="password" class="form-control" id="inputPassword3">
							    </div>
							  </div>
							  
							   <div class="row mb-3" style="float: right;">
							 	
							 		<div >
							 		<button type="submit" class="btn btn-secondary" >확인</button>
							      <button type="submit" class="btn" style="border-color: #6c757d;">취소</button>
							 		</div>
							  
							</div>
							  
							</form>
							</div>
					</div>
				</main>
                <jsp:include page="/WEB-INF/jsp/layout/footerLayout.jsp"/>
            </div>
        </div>
    </body>
</html>