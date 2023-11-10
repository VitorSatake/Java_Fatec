package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/ServletForm")
public class ServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		// TODO Auto-generated method stub
 		//response.getWriter().append("Served at: ").append(request.getContextPath());
 		
 		//configura padrao do tipo de resposta
 		response.setContentType("text/html; charset=UTF-8");
 		
 		//dentro de estrutura 'try', monta HTML de resposta
 		try(PrintWriter out = response.getWriter()) {
 			out.println("<!DOCTYPE HTML>");
 			out.println("<html>");
 			out.println("<head><title>Form para receber dados do usuário</title></head>");
 			out.println("<body>");
 			out.println("<h2>Form para receber dados do usuário.</h2>");
 			out.println("<form action='ServletFiguras' method='GET' >");
 			out.println("<label for='num1'>Informe o raio: </label>");
 			out.println("<input type='number' name='num1' id='num1' required><br>");
 			out.println("<label for='num2'>Informe a base: </label>");
 			out.println("<input type='number' name='num2' id='num2' required><br>");
 			out.println("<label for='num2'>Informe a altura: </label>");
 			out.println("<input type='number' name='num2' id='num3' required><br><br>");
 			out.println("<label for='opc'>Informe a operação desejada: <br></label> <br>");
 			out.println("<input type='submit' name='btnCalc' value='Calcular area Circulo' id='id_ad'><br><br>");
 			out.println("<input type='submit' name='btnCalc' value='Calcular area Retangulo'><br><br>");

 		
 			out.println("</form>");
 			out.println("</body>");
 			out.println("</html>");
 			}
 		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
