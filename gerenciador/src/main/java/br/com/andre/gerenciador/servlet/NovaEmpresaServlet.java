package br.com.andre.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

   
	
	// doPost serve para deixarmos esse método apenas fazendo o post para envio de dados
	// da para usar também o doGet para pegar as informações.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		
		System.out.println("Cadastrando nova Empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		Date dataAbertura = null;
		try {
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        Date dataAberturDate = sdf.parse(paramDataEmpresa);
	    } catch (ParseException e) {
	            throw new ServletException(e);
	    }

	
	    
		//Meu objeto
		Empresa empresa = new Empresa();
		//Seus atributos
		empresa.setNome(nomeEmpresa);
		empresa.setCnpj(nomeEmpresa);
		empresa.setTelefone(nomeEmpresa);
		empresa.setSite(nomeEmpresa);
	    empresa.setDataAbertura(dataAbertura);
		
		//Simulando Banco de dados
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		//Estamos chamando o JSP
		RequestDispatcher rd =  request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		request.setAttribute("empresaCnpj", empresa.getCnpj());
		rd.forward(request, response);
		
	}

}
