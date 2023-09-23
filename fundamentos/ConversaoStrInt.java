package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStrInt {
	public static void main(String[] args) {
		String v = JOptionPane.showInputDialog("Digite o primeiro número");
		String a = JOptionPane.showInputDialog("Insira o segundo número");
		
		System.out.println(v + a);
		
		double va = Double.parseDouble(v);
		double ab = Double.parseDouble(a);
		
		double soma = va + ab;
		System.out.println("Soma é: " + soma);
		System.out.println("Média é: "+ soma /2);
	}
}