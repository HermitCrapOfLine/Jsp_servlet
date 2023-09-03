 <!-- jsp 시작시 필요한 부분 -->
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


; 


<%@ include file="header.jsp" %>
  
  <div class="container">
  
  		<c:set var="date" value="<%=new java.util.Date()%>" />
  	
  	<h1>
  		<fmt:formatDate value="${date}" type="both" dateStyle="long"
  			timeStyle="long"/>
  	</h1>
  </div>
  
<%@ include file="footer.jsp" %>