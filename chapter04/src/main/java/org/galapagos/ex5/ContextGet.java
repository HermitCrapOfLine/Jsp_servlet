package org.galapagos.ex5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextGet
 */
@WebServlet("/contextget")
public class ContextGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = (String) getServletContext().getAttribute("name");
		int age =  (Integer) getServletContext().getAttribute("age");
		
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
		
			
	}

}
