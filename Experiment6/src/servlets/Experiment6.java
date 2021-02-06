package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Experiment6
 */
@WebServlet("/Experiment6")
public class Experiment6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Experiment6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		
		String value = request.getParameter("tutorials");
		
		
		if(value.equals("python")) {
			response.sendRedirect("https://www.w3schools.com/python/");
			
		}
		else if(value.equals("html")) {
			response.sendRedirect("https://www.w3schools.com/html/");
			
		}
		else if(value.equals("javascript")) {
			response.sendRedirect("https://www.w3schools.com/js/");
			
		}
		else if(value.equals("sql")) {
			response.sendRedirect("https://www.w3schools.com/sql/");
			
		}
		else if(value.equals("bootstrap")) {
			response.sendRedirect("https://www.w3schools.com/bootstrap/");
			
		}
	}

}
