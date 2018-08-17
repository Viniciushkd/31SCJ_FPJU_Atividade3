package br.com.exercicio3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;

public class Eficiencia {

	private static List<Integer> arraylist = new ArrayList<Integer>();
	private static LinkedList<String> linkedlist = new LinkedList<>();
	private static HashSet<String> hashsetlist = new HashSet<String>();
	private static WeakHashMap<Integer, String> weaklist = new WeakHashMap<Integer, String>();
	private static HashMap<Integer, String> hashlist = new HashMap<Integer, String>();
	private static Stack<String> stacklist = new Stack<String>();
	
	public static void main(String[] args) {
		adicaoDadosArrayList();
		System.out.println("");
		buscaDadosArrayList();
		
		adicaoDadosLinkedList();
		System.out.println("");
		buscaDadosLinkedList();
		
		adicaoDadosHashList();
		System.out.println("");
		buscaDadosHashList();
		
		adicaoDadosHashSetList();
		System.out.println("");
		buscaDadosHashSetList();
		
		adicaoDadosStackList();
		System.out.println("");
		buscaDadosStackList();
		
		adicaoDadosWeakList();
		System.out.println("");
		buscaDadosWeakList();
	}
	
	private static void adicaoDadosArrayList() {
		System.out.println("Adicionar dados:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=1;i<=1000000;i++) {
			arraylist.add(i);
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void buscaDadosArrayList() {
		System.out.println("Busca dado:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=1;i<=arraylist.size();i++) {
			if(i==500000)
				break;
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void adicaoDadosLinkedList() {
		System.out.println("Adicionar dados:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=1;i<=1000000;i++) {
			linkedlist.add(i, i+"");
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void buscaDadosLinkedList() {
		System.out.println("Busca dado:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=1;i<=linkedlist.size();i++) {
			if(i==500000)
				break;
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	

	private static void adicaoDadosStackList() {
		System.out.println("Adicionar dados:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=0;i<=1000000;i++) {
			stacklist.add(i+"");
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void buscaDadosStackList() {
		System.out.println("Busca dado:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=1;i<=stacklist.size();i++) {
			if(i==500000)
				break;
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void adicaoDadosHashSetList() {
		System.out.println("Adicionar dados:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=0;i<=1000000;i++) {
			hashsetlist.add(i+"");
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void buscaDadosHashSetList() {
		System.out.println("Busca dado:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=1;i<=hashsetlist.size();i++) {
			if(i==500000)
				break;
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void adicaoDadosHashList() {
		System.out.println("Adicionar dados:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=0;i<=1000000;i++) {
			hashlist.put(i, i+"");
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void buscaDadosHashList() {
		System.out.println("Busca dado:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=1;i<=hashlist.size();i++) {
			if(i==500000)
				break;
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void adicaoDadosWeakList() {
		System.out.println("Adicionar dados:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=0;i<=1000000;i++) {
			weaklist.put(i, i+"");
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
	private static void buscaDadosWeakList() {
		System.out.println("Busca dado:");
		LocalDateTime antes = LocalDateTime.now();
		System.out.println("Começou em: " + antes.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		for(int i=1;i<=weaklist.size();i++) {
			if(i==500000)
				break;
		}
		LocalDateTime depois = LocalDateTime.now();
		System.out.println("Terminou em: " + depois.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss")));
		System.out.println("Diferença de:" + ChronoUnit.NANOS.between(antes,depois));
	}
	
}
