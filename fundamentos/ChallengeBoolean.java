package fundamentos;
import java.util.Scanner;

public class ChallengeBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe se o primeiro trabalho deu certo (true/false):");
        boolean trabalho1 = scanner.nextBoolean();

        System.out.println("Informe se o segundo trabalho deu certo (true/false):");
        boolean trabalho2 = scanner.nextBoolean();

        if (trabalho1 && trabalho2) {
            System.out.println("Parabéns! Vocês comprarão uma TV de 55 Polegadas e tomarão sorvete no shopping.");
        } else if (trabalho1 || trabalho2) {
            System.out.println("Vocês irão para o shopping e comprarão sorvete e uma TV de 32 polegadas.");
        } else {
            System.out.println("Infelizmente, nenhum dos trabalhos deu certo. Vocês ficarão em casa, sem TV e sorvete.");
        }

        scanner.close();
    }
}
