package fundamentos;

public class ConversaoIntStr {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // Length só é acessado por uso da notação toString
		
		int num2 = 100;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num2).length()); // Gambiarra da sentença acima
	}
}