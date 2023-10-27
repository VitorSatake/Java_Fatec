package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalculadora
 */
@WebServlet("/ServletCalculadora")
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		try(PrintWriter out = response.getWriter()) {
			
			
			if(request.getParameter("num1") != null){
				
				float v1 = Float.parseFloat(request.getParameter("num1"));
				float v2 = Float.parseFloat(request.getParameter("num2"));
			}
				
				float resultado = 0;
				
				switch (request.getParameter("btnCalc")) {
				
				case "adicao": resultado = new Adicao().calcular(num1, num2); break;
				case "subtracao": resultado = new Subtracao(); break;
				case "adicao": resultado = new Adicao(); break;
				case "adicao": resultado = new Adicao(); break;
				
				}
				
			}
			
			
	
	}
			
			out.println(String.format("O resultado é: %.2f <br><br>", ));
	}


