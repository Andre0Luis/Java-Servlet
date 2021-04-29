package br.com.andre.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

//Simulação de um Banco de dados

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
