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
                        <h2 class="mt-4">가맹점 패스워드변경</h2>
                   </div>
                   <br> <br> <br> <br>  
					<div class="row justify-content-center" >
                    <div class="col-lg-10" >
                    <br>
                      	<form>
							  <table class="tableForm" style="width:100%;">
					            <tr>
					                <th colspan="2" >패스워드 변경</th>
					            </tr>
					            <tr>
					                <td align="center">기존 패스워드</td>
					                <td><input size="15" type="password"></td>
					            </tr>
					            <tr>
					                <td align="center">새로운 패스워드</td>
					                <td><input size="15" type="password"> *4~12자의 영문 대소문자와 숫자로만 입력</td>
					            </tr>
					            <tr>
					                <td align="center">패스워드 확인</td>
					                <td><input size="15" type="password"></td>
					            </tr>
					            </table>
					            <br>
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


