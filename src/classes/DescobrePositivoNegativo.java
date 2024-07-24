package classes;

import java.util.Scanner;

public class DescobrePositivoNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Integer numeroDigitado = null;

        System.out.println("Digite um número para descobrir se é positivo ou negativo:");
        numeroDigitado = leitura.nextInt();

        String mensagem = "Número positivo.";
        if (numeroDigitado < 0) {
            mensagem = "Número negativo.";
        }

        System.out.println(mensagem);
    }
}
