 <!-- jsp 시작시 필요한 부분 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%
	String[] order = {"첫번째", "두번째", "세번째", "네번째", "다섯번째"};
	request.setAttribute("order", order);
%>

<%@ include file="header.jsp" %>
  
  <div class="container">
  	<h1>
  		<c:forEach var="x" items="${order}">
  			<c:out value="${x}"/>
  			<br>
  		</c:forEach>
  	</h1>
  </div>
  
<%@ include file="footer.jsp" %>