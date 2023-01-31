package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String txt = "Good Morning X";
		txt = txt.replace("X","Vietnam");
		txt = txt.toUpperCase();
		txt = txt.concat("!!!");
		System.out.println(txt);
		
		String ponto = "Good Morning X".replace("X","Vietnam").toUpperCase().concat("!!!");
		System.out.println(ponto);
	}
}