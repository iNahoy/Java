package operadores;
public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean cond1 = true;
		boolean cond2 = 8 > 24;

		System.out.println(cond1 && !cond2);		
		System.out.println(cond1 || cond2);		
		System.out.println(cond1 ^ cond2);		
		System.out.println(!!cond1);
		System.out.println(!cond2);
		
		System.out.println("Tabela Verdade E (AND)");
		System.out.println(true  && true);
		//System.out.println(false && false);
		System.out.println(true  && false);
		//System.out.println(false && true);
		
		System.out.println("Tabela Verdade OU (OR)");
		//System.out.println(true  || true);
		System.out.println(false || false);
		//System.out.println(true  || false);
		System.out.println(false || true);
		
		System.out.println("Tabela Verdade OU Exclusivo (XOR)");
		System.out.println(true  ^ true);
		System.out.println(false ^ false);
		System.out.println(true  ^ false);
		System.out.println(false ^ true);
		
		System.out.println("Tabela Verdade do contra (NOT)");
		System.out.println(!true);
		System.out.println(!false);
	}
}