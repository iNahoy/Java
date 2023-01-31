package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		byte n = 127; // Byte vai de -128 até 127           LENG = 3
		short s = 32767; // Short vai de -32768 até 32767   LENG = 5
		int i = 235802183; //                               LENG = 9
		long l = 3_123_456_789L;// L NO FINAL
		float f = 1_445.44F; // F NO FINAL
		double d = 2_991_797_101.01;
		boolean preguiça = false;
		char status = 'A';
		
		System.out.println(n);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(preguiça);
		System.out.println(status);
	}
}