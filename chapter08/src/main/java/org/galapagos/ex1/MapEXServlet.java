package org.galapagos.ex1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MapEXServlet
 */
@WebServlet("/map")
public class MapEXServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapEXServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Map<String, String> whoAreYou = new HashMap();
		
		whoAreYou.put("name1", "세로");
		whoAreYou.put("name2", "토닌");
		
		request.setAttribute("hormone", whoAreYou);
		
		RequestDispatcher dis = request.getRequestDispatcher("Different.jsp");
		dis.forward(request, response);
		
	}


}
