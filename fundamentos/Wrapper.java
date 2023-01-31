package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Byte b = 100;
		Short s = 100;

		Integer i = Integer.parseInt(entrada.next());
		Long l = 10000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 5);
		System.out.println(l * 3);
		entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		
		Character ca = '$';
		System.out.println(ca + "...");
	}
}