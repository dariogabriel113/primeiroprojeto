package classes;

import java.util.Random;
import java.util.Scanner;

public class NumeroOculto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroOculto = new Random().nextInt(100);
        int palpite = -1;
        int tentativas = 0;

        while (palpite != numeroOculto && tentativas < 5) {
            System.out.print("\n");
            System.out.println("Digite um número e tente acertar o número oculto:");
            palpite = leitura.nextInt();

            if (palpite == numeroOculto) {
                System.out.println("Parabéns, você acertou");
                break;
            } else if (palpite > numeroOculto && tentativas < 4) {
                System.out.println("Quase, mas é um número menor");
            } else if (palpite < numeroOculto && tentativas < 4) {
                System.out.println("Quase, mas é um número maior");
            }

            tentativas++;
        }

        if (palpite != numeroOculto && tentativas >= 5) {
            System.out.println("Infelizmente suas tentativas acabaram");
        }
    }
}
