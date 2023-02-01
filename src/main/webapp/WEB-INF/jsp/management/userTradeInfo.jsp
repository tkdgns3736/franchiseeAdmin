<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/include/setting.jsp"/>
 <script type="text/javascript">
  $(document).ready(function() {
	  
	  	var Now = new Date(); // 현재 날짜 및 시간
		var nowyear = Now.getFullYear();
		var nowMonth = Now.getMonth() + 1; // 월

		function pluszero(time){
			var time = time.toString(); // 시간을 숫자에서 문자로 바꿈
			if(time.length < 2){ //2자리 보다 작다면
				time = '0' + time; //숫자앞 0을 붙여줌
				return time; //값을 내보냄
			}else{
			    return time; //2자리라면 값을 내보냄
			}
		}
		nowMonth = pluszero(nowMonth); //만들었던 함수 적용
		
	  $('#date-picker-year').val(nowyear);
	  $('#date-picker-month').val(nowMonth);
	  
	 	<%-- 조회 년 datepicker --%>
	    $('#date-picker-year').datepicker({
	        format: "yyyy",
	        minViewMode : 2, 
	        maxViewMode : 2,
	        language: "ko",
	        autoclose: true,
	    })
	 	<%-- 조회 월 datepicker --%>
	    $('#date-picker-month').datepicker({
	        format: "mm",
	        minViewMode : 1 ,
	        maxViewMode : 1 ,
	        language: "ko",
	        autoclose: true
	    }) 
	    
	  	<%-- 월별정산조회 버큰 click --%>
	    $('#date-picker').on('click', function(e) {
			e.preventDefault();
			var year = $('#date-picker-year').val();
			var month = $('#date-picker-month').val();
			alert(year+" - "+month);
		});
	    
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
                    	<h2 class="mt-2">회원별거래정보</h2>	
                    	</div>
                    	<div style="padding-bottom: 15px;">
                    	<div class="row">
	                        <div class="col-sm-8">
		                        <form class= "form-inline mt-2" >
		                          	<div class="input-group ">
		                          		<p class="h4 ms-2" style="font-weight: 300;">&nbsp;아이디&nbsp;</p>
				                		<input class=" ms-2 " type="text"  style="font-size: -0.125rem; height: 30px; width: 120px; border: 1px solid #ced4da; text-align: center;" />
			                    	<button class="btn btn-primary" type="button" style="height: 30px;display: flex;align-items: center;justify-content: center;">검색</button>
		                			</div>
		            			</form>
	            			</div>
            			</div>
            			
            			<div class="row">
	                        <div class="col-sm-8">
		                        <form class= "form-inline mt-2" >
		                          	<div class="input-group ">
		                          		<p class="h4 ms-2" style="font-weight: 300;">&nbsp;회원명&nbsp;</p>
				                		<input class=" ms-2 " type="text"  style="font-size: -0.125rem; height: 30px; width: 120px; border: 1px solid #ced4da; text-align: center;" />
		                			</div>
		            			</form>
	            			</div>
            			</div>		
                    	
                    	<div class="row">
	                        <div class="col-sm-8">
		                        <form class= "form-inline mt-2" >
		                          	<div class="input-group ">
		                          	
		                          		<p class="h4 ms-2" style="font-weight: 300;">조회일자&nbsp;</p>
				                		<input class=" ms-2 " id="date-picker-year"  type="text"  style="font-size: -0.125rem; height: 30px; width: 120px; border: 1px solid #ced4da; text-align: center;" />
				                		<input class=" ms-2 " id="date-picker-month" type="text"  style="font-size: -0.125rem; height: 30px; width: 120px; border: 1px solid #ced4da; text-align: center;"/>
		     
			                    	<button class="btn btn-primary " type="button" id="date-picker" style="height: 30px;"><i class="fas fa-search" style="vertical-align: initial;"></i></button>
		                			</div>
		            			</form>
	            			</div>
            			</div>
            			</div>	
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                회원별거래내역
                            </div>
                            <div class="card-body">
                           	 	<div class="table-responsive">
                                  <table id="datatablesSimple" class="table table-striped" style="width:100% ">
                                    <thead>
                                      <tr>
									      <th rowspan="2">날짜</th>
									      <th colspan="2">계좌입금</th>
									      <th colspan="2">포인트입금</th>
									      <th colspan="2">사용</th>
									    </tr>
									    <tr>
									      <th>건수</th>
									      <th>금액</th>
									      <th>건수</th>
									      <th>금액</th>
									      <th>건수</th>
									      <th>금액</th>
									    </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                        <th>총합계</th>
                                        <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>           
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <c:forEach items="${list}" var="list">
										<tr>
										<td > HI</td>
										<td>${list.seqNo}</td>
										<td>${list.traceType}</td>
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
