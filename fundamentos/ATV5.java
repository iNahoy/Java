package fundamentos;
/*Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.*/
import java.util.Scanner;

public class ATV5 {
	public static void main(String[] args) {
		
		Scanner entry = new Scanner (System.in);
		
		System.out.println("Digite o valor de base: ");
		double b = entry.nextDouble();
		
		System.out.println("Digite o valor de altura: ");
		double h = entry.nextDouble();
		
		double area = (b*h)/2;
		System.out.println(area);
		
		entry.close();
	}
}