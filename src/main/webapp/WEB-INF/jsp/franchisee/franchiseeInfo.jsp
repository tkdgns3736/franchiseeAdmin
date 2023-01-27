<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>

	.tableForm table {
	    width: 100%;
	    border: 1px solid #444444;
	    border-collapse: collapse;
	  }
	.tableForm th {
	    border: 1px solid #444444;
	    padding: 10px;
	  }
	  .tableForm td {
	    border: 1px solid #444444;
	    padding: 10px;
	  }


</style>

<jsp:include page="/WEB-INF/jsp/include/setting.jsp"/>
     	 <jsp:include page="/WEB-INF/jsp/layout/topLayout.jsp"/>
	
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h2 class="mt-4">마이페이지</h2>
                   </div>
                   <br> <br>
					<div class="row justify-content-center" >
                    <div class="col-lg-10" >
                    <br>
                      	<form>
							  <table class="tableForm" style="width:100%;">
					            <tr>
					                <td align="center">가맹점 번호</td>
					                <td align="center">??</td>
					                <td align="center">사업자 등록번호</td>
					                <td align="center">??</td>
					            </tr>
					            <tr>
					                <td align="center">가맹점 명</td>
					               <td align="center">??</td>
					               <td align="center">업종</td>
					                <td align="center">??</td>
					            </tr>
					            <tr>
					                <td align="center">대표자명</td>
					                <td align="center">??</td>
					                <td align="center">주민(법인)등록번호</td>
					                <td align="center">??</td>
					            </tr>
					            </table>
					            <br>
					            	  <table class="tableForm" style="width:100%;">
					            <tr>
					                <td align="center">가맹점 번호</td>
					                <td align="center">??</td>
					                <td align="center">사업자 등록번호</td>
					                <td align="center">??</td>
					            </tr>
					            <tr>
					                <td align="center">가맹점 명</td>
					               <td align="center">??</td>
					               <td align="center">업종</td>
					                <td align="center">??</td>
					            </tr>
					            <tr>
					                <td align="center">대표자명</td>
					                <td align="center">??</td>
					                <td align="center">주민(법인)등록번호</td>
					                <td align="center">??</td>
					            </tr>
					            </table>
					            <br>
					            
					            	  <table class="tableForm" style="width:100%;">
					            <tr>
					                <td align="center">가맹점 번호</td>
					                <td align="center">??</td>
					                <td align="center">사업자 등록번호</td>
					                <td align="center">??</td>
					            </tr>
					            <tr>
					                <td align="center">가맹점 명</td>
					               <td align="center">??</td>
					               <td align="center">업종</td>
					                <td align="center">??</td>
					            </tr>
					            <tr>
					                <td align="center">대표자명</td>
					                <td align="center">??</td>
					                <td align="center">주민(법인)등록번호</td>
					                <td align="center">??</td>
					            </tr>
					            </table>
					            <br>
							   <div class="row mb-3" style="float: right;">
							 	
							 		<div>
								 		<button type="button" class="btn btn-secondary"onClick="location.href='page/franch/changePass'">패스워드 변경</button>
								      	<button type="button" class="btn" style="border-color: #6c757d;"onClick="location.href='page/franch/changeFranchInfo'">가맹점정보변경</button>
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