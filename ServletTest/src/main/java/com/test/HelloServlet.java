package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/hello")
@WebServlet(urlPatterns = {"/hello", "/world"})

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void destroy() {
		super.destroy();
		System.out.println("파괴 되었습니다.");
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("초기화 되었습니다 ");
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("TestServlet 실행");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello</h1>");
		out.println("</body>");
		out.println("</html>");
	
	}

}
