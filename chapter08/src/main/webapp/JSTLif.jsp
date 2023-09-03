 <!-- jsp 시작시 필요한 부분 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%  %>


<%@ include file="header.jsp" %>
  
  <div class="container">
  	<h1>
  		<c:set var="cake" value="치즈케이크"/>
  		<c:if test="${cake == '치즈케이크' }">
  		치즈케이크 입니다.
  		</c:if>
  		
  		<c:if test= "${cake != '치즈케이크' }">
  		치즈케이크가 아닙니다.
  		</c:if>
  	</h1>
  		
  </div>
  
<%@ include file="footer.jsp" %>