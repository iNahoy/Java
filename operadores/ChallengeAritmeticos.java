package operadores;

public class ChallengeAritmeticos {
	public static void main(String[] args) {

		// eq1
		int a = 6 * (3+ 2);
		int ra = (int) Math.pow(a, 2);
		int sa = 3*2;
		int eq1p = ra / sa;
		
		// eq2
		int b = (1-5) * (2-7);
		int beq = b / 2;
		int eq2p = (int) Math.pow(beq, 2);
		
		// eq3
		int res = eq1p - eq2p;
		int numerador = (int) Math.pow(res, 3);
		int denominador = (int) Math.pow(10, 3);
		int resultado = numerador / denominador;
		System.out.println(resultado);
		
	}
}