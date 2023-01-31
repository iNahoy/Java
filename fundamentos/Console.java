package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("Dia");      // Não quebra linha
		
		System.out.println("!");
		System.out.println("Bom");
		System.out.println("Dia!"); // Quebra a linha
		
		System.out.printf("Megasena da virada: %d, %d, %d, %d, %d, %d", 04,05,10,34,58,59); // Print formatado %S = String %D = Int %F = Float
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("\nDigite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		int idade = entrada.nextInt();                // Line = String | Int = Numero inteiro
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade );
		
		entrada.close();
	}
}