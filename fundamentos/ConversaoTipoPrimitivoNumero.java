package fundamentos;

public class ConversaoTipoPrimitivoNumero {
	public static void main(String[] args) {
		double a = 1;                     // Conversão Implícita
		System.out.println(a);
		
		float b = (float) 1.123456789999; // Conversão Explícita (CAST)
		System.out.println(b);
		
		int c = 360; 			  // Conversão Explícita (CAST)
		byte d = (byte) c;
		System.out.println(d);
	}
}
