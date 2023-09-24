package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = entry.nextDouble();
		
		if (nota <= 10 && nota >= 8)
			System.out.println("Categoria A - Elite");
		else if (nota <= 7.9 && nota >= 6.0)
			System.out.println("Categoria B - Bom");
		else if (nota <= 5.9 && nota >= 4.0)
			System.out.println("Categoria C - Acorda pra vida jogador...");
		else if (nota <= 3.9 && nota >= 2.0)
			System.out.println("Categoria D - Cê tá na merda");
		else if (nota <= 1.9 && nota >= 0.0)
			System.out.println("Categoria F - FUDIDO");
		else 
			System.out.println("Nota incorreta");
		
		entry.close();
	}
}
