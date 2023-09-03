 <!-- jsp 시작시 필요한 부분 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp" %>
  <body>
  <div class="container">
  	<h1>
  		JSTL Core 라이브러리 실습
  	</h1>
  	
  	<c:set var="myColor" value="빨강" />
  	<c:if test="${myColor ==  '빨강'}">
  	빨간펜!
  	</c:if>
  </body>
  <%@ include file="footer.jsp" %>