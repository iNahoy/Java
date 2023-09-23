package fundamentos;
/*Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.*/
import java.util.Scanner;

public class ATV3 {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = entry.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = entry.nextDouble();
		
		double imc = peso / (altura*altura);
		System.out.println("Seu imc é de: " + imc);
		
		entry.close();
	}
}