package fundamentos;
/*Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.*/
import java.util.Scanner;

public class ATV2 {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		System.out.println("Digite a temperatura em farenheit: ");
		double f = entry.nextDouble();
		
		
		double conversão = (f-32) * 5/9;
		System.out.println(conversão + " É o valor da temperatura em Celsius");
		entry.close();
		
	}
}