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
@WebServlet("/form")
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
			out.println("<form action='' method='GET' >");
			out.println("<label for='nome'>Nome: </label>");
			out.println("<input type='text' name='nome' maxlength='5' required autofocus id='id_nome'><br>");
			out.println("<label for='email'>Email: </label>");
			out.println("<input type='email' name='email' maxlength='10' required id='id_email'><br>");
			out.println("<input type='submit' value='Enviar' ><br><br>");
			
			if(request.getParameter("nome") != null){
			
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			
			out.println(String.format("Ola, %s, seja bem vindo!<br><br>", nome));
			out.println(String.format("Seu login é: %s", email));
			
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
			}
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
