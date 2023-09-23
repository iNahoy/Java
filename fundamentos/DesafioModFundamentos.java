package fundamentos;

import java.util.Scanner;

public class DesafioModFundamentos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a OP ( + - % * /) ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		System.out.printf("%f %s %f = %2f", 
				num1, op, num2, resultado);
		entrada.close();
	}
}