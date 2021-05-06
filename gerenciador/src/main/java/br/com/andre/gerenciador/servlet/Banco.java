package br.com.andre.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

//Simulação de um Banco de dados

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	//bloco estatico para não cadastrar tudo novamente.
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("FNC");
		empresa.setCnpj("22.564.123/0001-52");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("ALURA");
		empresa2.setCnpj("22.125.456/0001-65");
		
		Empresa empresa3 = new Empresa();
		empresa3.setNome("J.A BAZAR E PAPELARIA");
		empresa3.setCnpj("22.829.062/0001-43");
		
		lista.add(empresa);
		lista.add(empresa2);
		lista.add(empresa3);
	}
	

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
