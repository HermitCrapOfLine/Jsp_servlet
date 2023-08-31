<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>오늘 점심은 뭐먹지?</h1>
	<p>그러게용.</p>
</body>
</html>

	<servlet>
		<servlet-name>helloServlet</servlet-name>
			<servlet-class>com.test.helloServlet</servlet-class>
			<init-param>
			   <param-name>dirPath</param-name>
			   <param-value>c:\\test</param-value>
			</init-param>
	</servlet>
			<servlet-mapping>
						<servlet-name>helloServlet</servlet-name>
						<url-pattern>/world</url-pattern>
			</servlet-mapping>