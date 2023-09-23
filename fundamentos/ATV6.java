package fundamentos;

import java.util.Scanner;
/*Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

fiz a formula de bhaskara completa :D*/
public class ATV6 {
	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		double a = entry.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		double b = entry.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		double c = entry.nextDouble();
		
		double delta =(b*b)-4*a*c;
		System.out.println("Delta é igual a: " + delta);
		
		double raizquadrada = Math.sqrt(delta);
		System.out.println("E a raiz quadrada de delta é igual a: " + raizquadrada);
		
		double baskpositivo = (-b + raizquadrada) / 2*a;
		System.out.println("X1 é igual a: " + baskpositivo);
		
		double basknegativo = (-b - raizquadrada) / 2*a;
		System.out.println("X2 é igual a: " + basknegativo);
		entry.close();
	}
}