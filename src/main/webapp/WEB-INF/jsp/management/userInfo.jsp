<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/jsp/include/setting.jsp"/>
 <script type="text/javascript">
  $(document).ready(function() {
   
	    var lang_kor = {
	            "decimal" : "",
	            "emptyTable" : "데이터가 없습니다.",
	            "info" : "_START_ - _END_ (총 _TOTAL_ 개)",
	            "infoEmpty" : "0개",
	            "infoFiltered" : "(전체 _MAX_ 개 중 검색결과)",
	            "infoPostFix" : "",
	            "thousands" : ",",
	            "lengthMenu" : "_MENU_ 개씩 보기",
	            "loadingRecords" : "로딩중...",
	            "processing" : "처리중...",
	            "search" : "검색 : ",
	            "zeroRecords" : "검색된 데이터가 없습니다.",
	            "paginate" : {
	                "first" : "첫 페이지",
	                "last" : "마지막 페이지",
	                "next" : "다음",
	                "previous" : "이전"
	            },
	            "aria" : {
	                "sortAscending" : " :  오름차순 정렬",
	                "sortDescending" : " :  내림차순 정렬"
	            }
	        };
	    
	    <%-- 테이블 --%>
	    $('#datatablesSimple').DataTable({
            language : lang_kor //or lang_eng
        });
	    
	})
  </script>
  <style>
  
  .table-striped th{text-align: center !important; vertical-align: middle; !important; border: 1px solid #c6c9cc;}
  .table-striped thead tr th{text-align: center !important; vertical-align: middle; !important;}
  .table-striped td{text-align: center !important; vertical-align: middle; !important; border: 1px solid #c6c9cc;}
  
	table {font-size: 80%;}
  </style>
        
     	 <jsp:include page="/WEB-INF/jsp/layout/topLayout.jsp"/>
	
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                    	<div style="padding-bottom: 50px;">
                    	<h2 class="mt-2">회원정보</h2>	
                    	</div>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                회원 내역
                            </div>
                            <div class="card-body">
                           	 	<div class="table-responsive">
                                  <table id="datatablesSimple" class="table table-striped" style="width:100% ">
                                    <thead>
                                    
                                    
                                      <tr>
									      <th>그룹</th>
									      <th>가입일</th>
									      <th>이름</th>
									      <th>아이디</th>
									      <th>연락처</th>
									    </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${list}" var="list">
										<tr>
										<td>${list.traceType}</td>
										<td>${list.traceType}</td>
										<td>${list.traceType}</td>
										<td>${list.traceType}</td>
										<td>${list.traceType}</td>
										</tr>
										</c:forEach>
                                    </tbody>                        
                           		</table>
                            </div>
                            </div>
                        </div>
                    </div>
                </main>
                <jsp:include page="/WEB-INF/jsp/layout/footerLayout.jsp"/>
            </div>
        </div>
    </body>
</html>