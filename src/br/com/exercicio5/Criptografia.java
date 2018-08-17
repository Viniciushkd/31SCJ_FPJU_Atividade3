package br.com.exercicio5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Criptografia {

	private static final String caminhoCodficado = "C:\\mensagemCodificada.txt";
	private static final String caminhoDecodificado = "C:\\mesagemDecodificada.txt";
	
	public static void main(String[] args) throws IOException { 
		  String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed "
		  		+ "do eiusmod tempor incididunt ut labore et dolore magna aliqua";
		  
		  StringBuilder criptografia = criptografar(caminhoCodficado, texto);
		  System.out.println(criptografia);
		  System.out.println(descriptografar(caminhoDecodificado, criptografia.toString())); 
	}
	
	public static StringBuilder criptografar(String path, String mensagem) throws IOException {		 
		 StringBuilder cripto = new StringBuilder();		 
		 for(int i=0;i<= mensagem.length()-1;i++){  
			cripto.append((char)((int)mensagem.charAt(i)+1));
		  } 		
		  gravar(path, cripto);
		  return cripto; 
	}
	
	public static StringBuilder descriptografar(String path, String texto) throws IOException {		 
		 StringBuilder descripto = new StringBuilder();		 
		 for(int i=0; i<=texto.length()-1;i++){  
			 descripto.append((char)((int)texto.charAt(i)-1));
		  } 		
		 gravar(path, descripto);
		 return descripto ; 
	}
	
	public static void gravar(String path, StringBuilder texto) throws IOException {
		FileWriter fw = new FileWriter(path);
	    PrintWriter pw = new PrintWriter(fw); 
	    pw.printf(texto.toString()); 
	    fw.close();
	}
}