package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Digite a média: ");
		double x = entry.nextDouble();
		
		if(x <= 10 && x >= 7.0)
			System.out.println("Aprovado");
		
		if (x < 7  && x >=4.5)
			System.out.println("Recuperação");
		entry.close();
	}
}
