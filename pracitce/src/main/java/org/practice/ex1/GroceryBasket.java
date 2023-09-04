package org.practice.ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GroceryBasket
 */
@WebServlet("/grocerybasket")
public class GroceryBasket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("장바구니 리스트");

		// 세션객체 얻기
		HttpSession session = request.getSession(false);
		
		
		// time-out 10초 뒤에 세션이 제거된다.
		session.setMaxInactiveInterval(10);

		if (session != null) {
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("grocery");
			out.print("식료품: " + list + "<br>");
		} 
		out.print("<a href='groceries.html'> 심부름 목록</a><br>");
		out.print("</body></html>");

	}

}
