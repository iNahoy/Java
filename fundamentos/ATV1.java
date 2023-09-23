package fundamentos;
/*Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.*/
import java.util.Scanner;

public class ATV1 {
	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = entry.nextDouble();
		
		double conversao = celsius * 1.8 + 32;
		
		System.out.print("Valor em Farenheit: " + conversao);
		
		entry.close();
	}
}