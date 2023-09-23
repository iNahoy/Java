package fundamentos;

import java.util.Scanner;

public class ChallengeConv {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro salario:");
		String v1 = entrada.next().replace(",",".");
		
		System.out.println("Insira o segundo salario:");
		String v2 = entrada.next().replace(",",".");
		
		System.out.println("Insira o terceiro salario:");
		String v3 = entrada.next().replace(",",".");
		
		double salario1 = Double.parseDouble(v1);
		double salario2 = Double.parseDouble(v2);
		double salario3 = Double.parseDouble(v3);
		
		double somasalario = salario1 + salario2 + salario3;
		double media = somasalario / 3;
		System.out.println("A media dos salarios é: " + media);
		entrada.close();
	}
}