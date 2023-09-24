package controle;

import java.util.Scanner;

public class DesafioWeekday {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Digite aqui o dia da semana: ");
		int weekday = entry.nextInt();
		
		if (weekday <= 7 && weekday > 0 ) {
			if (weekday == 1) 
				System.out.println("Hoje é Domingo!");
			else if (weekday == 2) 
				System.out.println("Hoje é Segunda!");
			else if (weekday == 3) 
				System.out.println("Hoje é Terça!");
			else if (weekday == 4) 
				System.out.println("Hoje é Quarta!");
			else if (weekday == 5) 
				System.out.println("Hoje é Quinta!");
			else if (weekday == 6) 
				System.out.println("Hoje é Sexta!");	
			else if (weekday == 7) 
				System.out.println("Hoje é Sábado!");
		}else 
			System.out.println(
				"Dia inválido");
		entry.close();
	}
}