package operadores;

public class OperadoresTernarios {
	public static void main(String[] args) {
		double media = 5.6;
		String resultadoParcial = media >= 5.0 ? "Recuperação" : 
			"Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" :
			resultadoParcial;
		System.out.println(resultado);
		
		double nota = 9.9;
		boolean bomComp = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComp && passouPorMedia;
		String resultadodesc = temDesconto ? "Sim" : "Não";
		
		System.out.println("O aluno tem desconto? " + resultadodesc);
	}
}