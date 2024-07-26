package classes;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroDigitado = 0;

        System.out.println("Digite um número para saber se é par ou impar");
        numeroDigitado = leitura.nextInt();

        String mensagem = "É um número impar";
        if (numeroDigitado % 2 == 0) {
            mensagem = "É um número par";
        }

        System.out.println(mensagem);
    }
}
