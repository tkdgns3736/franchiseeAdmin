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
			var gropCode = $('.form-select').val();
			alert(year+" - "+month +"Code : "+gropCode);
		});
	    
	  	
	    <%-- 테이블 --%>
	    $('#datatablesSimple').DataTable();
	    
	    
	})
  </script>
  <style>
  
  .datatablesSimple th{text-align: center !important; vertical-align: middle; !important;}
  .datatablesSimple thead tr th{text-align: center !important; vertical-align: middle; !important;}
  .datatablesSimple td{text-align: center !important; vertical-align: middle; !important;}
  
	table {font-size: 80%;}
  </style>
        
     	 <jsp:include page="/WEB-INF/jsp/layout/topLayout.jsp"/>
	
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                    	<h2 class="mt-2">월별정산관리</h2>	
                    	
                    	<div class="row">
	                    	<div class="col-sm-4">
	                        	
	                        </div>
	                        <div class="col-sm-8">
		                        <form class= "form-inline mt-2" >
		                          	<div class="input-group ">
										<p class="h4 ms-2" style="font-weight: 300;">그룹코드&nbsp;</p>
										<select class="form-select  form-control-sm" style="height: 0px;">
										  <option selected></option>
										  <option value="1">One</option>
										  <option value="2">Two</option>
										  <option value="3">Three</option>
										</select>
			                			<p class="h4 ms-2" style="font-weight: 300;">조회일자&nbsp;</p>
			                		<input class="form-control form-control-sm ms-2 " id="date-picker-year"  type="text"  style="font-size: -0.125rem; height: 34px;" />
			                		<input class="form-control form-control-sm ms-2 " id="date-picker-month" type="text"  style="font-size: -0.125rem; height: 34px;"/>
			                    	<button class="btn btn-primary " type="button" id="date-picker" style="height: 34px;"><i class="fas fa-search"></i></button>
		                			</div>
		            			</form>
	            			</div>
            			</div>
                        <br>
                    	
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                월별 정산 내역
                            </div>
                            <div class="card-body">
                                  <table id="datatablesSimple" class="datatablesSimple" style="width:100% ">
                                    <thead>
                                      <tr>
									      <th rowspan="2">날짜</th>
									      <th colspan="3">계좌입금</th>
									      <th colspan="3">포인트입금</th>
									      <th colspan="3">사용</th>
									      <th rowspan="2">수수료<br>합계</th>
									    </tr>
									    <tr>
									      <th>건수</th>
									      <th>금액</th>
									      <th>수수료<br>소계</th>
									      <th>건수</th>
									      <th>금액</th>
									      <th>수수료<br>소계</th>
									      <th>건수</th>
									      <th>금액</th>
									      <th>수수료<br>소계</th>
									    </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>Name</th>
                                            <th>Position</th>
                                            <th>Office</th>
                                            <th>Age</th>
                                            <th>Start date</th>
                                            <th>Salary</th>
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
										<td>${list.traceType}</td>
										<td>${list.traceType}</td>
										<td >${list.traceType}</td>
										</tr>
										</c:forEach>
                                    </tbody>                        
                           		</table>
                            </div>
                        </div>
                    </div>
                </main>
                <jsp:include page="/WEB-INF/jsp/layout/footerLayout.jsp"/>
            </div>
        </div>
    </body>
</html>
