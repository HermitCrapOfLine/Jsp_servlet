 <!-- jsp 시작시 필요한 부분 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="text-right mr-5">
		<hr>
		<c:if test="${empty userid}">
  			${userid} (<a href="logout.jsp">로그아웃</a>)
  		</c:if>
  		
  		<c:if test="${not empty userid}">
 			(<a href="login.jsp">로그인</a>)
  		</c:if>
  		<hr>
 </div>