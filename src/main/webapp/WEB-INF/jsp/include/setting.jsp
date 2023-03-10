<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
    	<base href="/" />
    	<title>가맹점 관리 페이지</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
      
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <script src="js/scripts.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script> 
        
        
       	<link href="https://cdn.datatables.net/1.13.1/css/jquery.dataTables.min.css" rel="stylesheet" />
		<script src="https://cdn.datatables.net/1.13.1/js/jquery.dataTables.min.js"></script>
        
        <!--  <link href="https://cdn.datatables.net/1.13.2/js/jquery.dataTables.min.js" rel="stylesheet" />
		<script src="https://cdn.datatables.net/1.13.2/js/dataTables.bootstrap4.min.js"></script> -->
        
        
        
        
		<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js" ></script>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css"/>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/locales/bootstrap-datepicker.ko.min.js"></script>

		<%-- 페이지 오류 문구 출력 --%>
		<c:if test="${not empty errorMessage}">
		<script>
			alert('${errorMessage}');
		</script>
		</c:if>
		
	</head>
	
	