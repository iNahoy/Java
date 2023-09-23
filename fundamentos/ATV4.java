package fundamentos;
/*Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.*/
import java.util.Scanner;

public class ATV4 {
	public static void main(String[] args) {
	
		Scanner entry = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		int valor = entry.nextInt();
		
		int quadrado = valor*valor;
		int cubo = valor*valor*valor;
		
		System.out.println(quadrado);
		System.out.println(cubo);
		entry.close();
		
	}
}