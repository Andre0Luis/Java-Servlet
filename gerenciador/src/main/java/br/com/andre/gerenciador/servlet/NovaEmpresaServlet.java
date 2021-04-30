package br.com.andre.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;


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

   
	// doPost serve para deixarmos esse m�todo apenas fazendo o post para envio de dados
	// da para usar tamb�m o doGet para pegar as informa��es.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		
		System.out.println("Cadastrando nova Empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		//Meu objeto
		Empresa empresa = new Empresa();
		//Seus atributos
		empresa.setNome(nomeEmpresa);
		empresa.setCnpj(nomeEmpresa);
		empresa.setTelefone(nomeEmpresa);
		empresa.setSite(nomeEmpresa);
		
		//Simulando Banco de dados
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa "+ nomeEmpresa +" cadastrada com SUCESSO!!!</body></html>");
		
	}

}
