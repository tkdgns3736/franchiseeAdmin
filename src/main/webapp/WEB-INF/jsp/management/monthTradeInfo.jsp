<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/include/setting.jsp"/>
 <script type="text/javascript">
  $(document).ready(function() {
	  
	  	var Now = new Date(); // 현재 날짜 및 시간
		var nowyear = Now.getFullYear();
		var nowMonth = Now.getMonth() + 1; // 월
		var nowDay = Now.getDate(); // 일
		
		
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
		nowDay = pluszero(nowDay);
		
		var nowT = nowyear+nowMonth+nowDay;
	  $('#date-picker-start').val(nowT);
	  $('#date-picker-end').val(nowT);
	  
	 	<%-- 조회 년 datepicker --%>
	    $('#date-picker-start').datepicker({
	        format: "yyyymmdd",
	        language: "ko",
	        autoclose: true,
	    })
	 	<%-- 조회 월 datepicker --%>
	    $('#date-picker-end').datepicker({
	        format: "yyyymmdd",
	        language: "ko",
	        autoclose: true
	    }) 
	    
	  	<%-- 월별정산조회 버큰 click --%>
	    $('#date-picker').on('click', function(e) {
			e.preventDefault();
			
			
			 $.ajax({
		        url : "/api/management/dayTradeInfo", // 요기에
		        type : 'POST', 
		        data : {sDate : $('#date-picker-start').val(), eDate : $('#date-picker-end').val(), seachType : $('.form-select').val()},	
			 	success : function(result, status, xhr) {
	            	if(xhr.getResponseHeader('X-PINP-STATUS')=="0000")
	            		dataTable(result);
	            	
	            	else
	            		alert("조회실패"); 
	            },
	            error : function(xhr, status) {
	                alert(xhr + " : " + status);
	            }
	        });
			 
		});
	    
	    function dataTable(result){
	    	var table = $("#datatablesSimple").DataTable();
	    	table.destroy();
	   		$('#datatablesSimple').DataTable({
	      	language : lang_kor, //or lang_eng
	      	data : result,
            columns : [
            	
                {data: "TRACE_TYPE_DETAIL"},
                {data: "INPUTDATE"},
                {data: "GAME_CODE"},
                {data: "FEE_RATIO"},
                {data: "TRACE_TYPE"},
                {data: "FEE"},
                {data: "CNT"},
                {data: "FEE_SUM"},
                {data: "POINT"},
                {data: "STORE_NM"}
            ]
			/* var year = $('#date-picker-start').val();
			var month = $('#date-picker-end').val();
			var gropCode = $('.form-select').val();
			alert(year+" - "+month +"Code : "+gropCode); */
			});
		}
	    
	    
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
            language : lang_kor, //or lang_eng
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
                    	<!-- <div style="padding-bottom: 50px;">
                    	<h2 class="mt-2">일별정산관리</h2>	
                    	</div>
                    	<div class="row" style="padding-bottom: 15px;">
	                        <div class="col-sm-8">
		                        <form class= "form-inline mt-2" >
		                          	<div class="input-group ">
		                          	
		                          		<p class="h4 ms-2" style="font-weight: 300;">조회일자&nbsp;</p>
				                		<input class=" ms-2 " id="date-picker-year"  type="text"  style="font-size: -0.125rem; height: 30px; width: 120px; border: 1px solid #ced4da; text-align: center;" />
				                		<input class=" ms-2 " id="date-picker-month" type="text"  style="font-size: -0.125rem; height: 30px; width: 120px; border: 1px solid #ced4da; text-align: center;"/>
		                          	
										<p class="h4 ms-2" style="font-weight: 300;">그룹코드&nbsp;</p>
										<select class="" style="font-size: -0.125rem; height: 30px; width:120px; border: 1px solid #ced4da; text-align: center;">
										  <option selected></option>
										  <option value="1">One</option>
										  <option value="2">Two</option>
										  <option value="3">Three</option>
										</select>
			                		
			                    	<button class="btn btn-primary " type="button" id="date-picker" style="height: 30px;"><i class="fas fa-search" style="vertical-align: initial;"></i></button>
		                			</div>
		            			</form>
	            			</div>
	            			
	            			<div class="col-sm-4"></div>
            			</div>	 -->
                        <div class="card mb-4">
                            <div class="card-header">
                                <H4>일별 정산 내역</H4>
                                <div class="row" > <!-- style="padding-bottom: 15px;" -->
	                        <div class="col-sm-8">
		                        <form class= "form-inline mt-2" >
		                          	<div class="input-group ">
		                          	
		                          		<p class="ms-2" style="font-weight: 300;">조회일자&nbsp;</p>
				                		<input class=" ms-2 " id="date-picker-start"  type="text"  style="font-size: -0.125rem; height: 25px; width: 120px; border: 1px solid #ced4da; text-align: center;" />
				                		<input class=" ms-2 " id="date-picker-end" type="text"  style="font-size: -0.125rem; height: 25px; width: 120px; border: 1px solid #ced4da; text-align: center;"/>
		                          	
										<p class="ms-2" style="font-weight: 300;">그룹코드&nbsp;</p>
										<select class="" style="font-size: -0.125rem; height: 25px; width:120px; border: 1px solid #ced4da; text-align: center;">
										  <option selected></option>
										  <option value="1">0</option>
										  <option value="2">0</option>
										  <option value="3">0</option>
										</select>
			                		
			                    	<button class="btn btn-primary " type="button" id="date-picker" style="height: 25px;width: 45px;font-size: 14px;" >조회</button>
		                			</div>
		            			</form>
	            			</div>
	            			
	            			<div class="col-sm-4"></div>
            			</div>	
                                
                            </div>
                            <div class="card-body">
                           	 	<div class="table-responsive">
                                  <table id="datatablesSimple" class="table table-striped" style="width:100% ">
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
                                        <th>총합계</th>
                                        <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>
                                          <th></th>                   
                                        </tr>
                                    </tfoot>
                                    <tbody>
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
