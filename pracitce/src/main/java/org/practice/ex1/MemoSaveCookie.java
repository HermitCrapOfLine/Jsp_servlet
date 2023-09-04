package org.practice.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemoSaveCookie
 */
@WebServlet("/memosavecookie")
public class MemoSaveCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("test/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 입력 파라미터 얻기 
		String grocery = request.getParameter("grocery");
		
		// 기존 쿠키 얻기
		Cookie[] cookies = request.getCookies();
		Cookie c = null;
		
		if (cookies == null || cookies.length == 0) {
			c = new Cookie("grocery", grocery);
		}else {
			c = new Cookie("grocery" + (cookies.length+1), grocery);
		}
	
		response.addCookie(c);
		
		out.print("<html><body>");
		out.print("Product 추가");
		out.print("<a href="+response.encodeUrl("CartBasketCookie")+
				">장바구니 보기</a>");
		out.print("</body></html>");
	}

}
