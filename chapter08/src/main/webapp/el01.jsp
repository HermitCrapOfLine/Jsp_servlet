 <!-- jsp 시작시 필요한 부분 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<% 
	String name = "null";
//	request.setAttribute("name", "test");
	
%>

  <body>
  <div class="container">
  	<h1>
  		${name} / <%=name%>
  	</h1>
  </body>
  <%@ include file="footer.jsp" %>