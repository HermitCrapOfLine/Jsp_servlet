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
 * Servlet implementation class MemoSaveSeesion
 */
@WebServlet("/memosave")
public class MemoSaveSeesion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");

		PrintWriter out = response.getWriter();

		// 입력 파라미터 얻기
		String grocery = request.getParameter("grocery");

		// 세션객체 얻기
		// 세션을 얻는 getSession 메소드
		HttpSession session = request.getSession(); // 세션을 얻는 getSession 메소드
		ArrayList<String> list =
				(ArrayList<String>)session.getAttribute("grocery");
		
		if (list == null) {
			list = new ArrayList<String>();
			list.add(grocery);
			session.setAttribute("grocery", list);
		
		}else {
			list.add(grocery);
		}
		out.print("<html><body>");
		out.print("Grocery 추가");
		out.print("<a href='grocerybasket'> 장바구니 보기 </a>");
		out.print("</body></html>");

	}

}
