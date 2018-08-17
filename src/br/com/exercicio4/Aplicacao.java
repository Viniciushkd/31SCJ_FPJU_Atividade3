package br.com.exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Aplicacao {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("João Garcia", 20, 'M', "AIK Emterprises"));
		pessoas.add(new Pessoa("Maria Martins", 44, 'F', "Simples"));
		pessoas.add(new Pessoa("Henrique Fernando", 43, 'M', "AIK Emterprises"));
		pessoas.add(new Pessoa("Inácio Luiz", 33, 'M', "Magazine André"));
		pessoas.add(new Pessoa("Fernando Ferreira", 87, 'M', "Casas Recife"));
	
	
		System.out.println(pessoas);
		Random random = new Random();
		pessoas.remove(random.nextInt(pessoas.size()));
		Collections.sort(pessoas);
		System.out.println(pessoas);
		Collections.sort(pessoas, Collections.reverseOrder());
		System.out.println(pessoas);
	}
}
