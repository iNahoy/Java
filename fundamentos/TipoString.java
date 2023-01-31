package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("FAPOFKIASOPFKSAFPSKOSAPQWEOIWQEOIJQW".charAt(9));
		String s = "boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toUpperCase().startsWith("BOA"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("BOA TARDE"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
	}
}