package br.com.andre.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//Para configurar o nosso nome do arquivo OI
@WebServlet(urlPatterns = "/oi")
public class HelloWordServlet extends HttpServlet {
	
	@Override	
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException {
		
		PrintWriter out = arg1.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<Olá, Eu acabo de escrever o primeiro Servlet.>");
		out.println("</body>");
		out.println("</html>");
		
		//Mensagem que será exibida em nosso console, para sabermos se a informação está sendo executada.
		System.out.println("Mensagem Servlet iniciada");
	}

	

}
