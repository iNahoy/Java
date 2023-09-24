package controle;
/* atividade consiste em encontrar o erro do codigo java
 * que esta localizado no ; logo apos o fechamento do parentese do if
 * o erro se dá pois com o mesmo, sua sentença de codigo fecha qualquer
 * controle de relação possivel, assim printando na tela a mensagem que
 * deveria ser printada somente se o aluno houvesse tirado nota maior
 * ou igual a 9!
 */

public class DesafioIf {
	public static void main(String[] args) {
		double nota = 1.2;
		
		if (nota >= 9);{
			System.out.println("Parabens vc é fera!");
			System.out.println("O melhor da turma mlk " + nota);
		}

	}
}