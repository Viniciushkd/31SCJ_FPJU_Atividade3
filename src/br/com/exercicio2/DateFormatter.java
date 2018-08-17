package br.com.exercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
		LocalDateTime data = LocalDateTime.of(2012, 9, 10, 12, 00);
		formatarData(data);
	}

	
	private static void formatarData(LocalDateTime data) {
		
		System.out.println(data.format(DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm")));
		System.out.println(data.format(DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss")));
		System.out.println(data.format(DateTimeFormatter.ofPattern("E")));
		System.out.println(data.format(DateTimeFormatter.ofPattern("u")));
		System.out.println(data.format(DateTimeFormatter.ofPattern("G")));
	}
}
