package classes;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroDigitado = 1;

        System.out.println("Digite um número para exibir sua tabuada");
        numeroDigitado = leitura.nextInt();

        System.out.println("------------------Tabuada------------------");

        System.out.println("Adição");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeroDigitado + " + " + i + " = " + (numeroDigitado + i));
        }

        System.out.println("");
        System.out.println("Subtração");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeroDigitado + " - " + i + " = " + (numeroDigitado - i));
        }

        System.out.println("");
        System.out.println("Multiplicação");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeroDigitado + " x " + i + " = " + (numeroDigitado * i));
        }

        System.out.println("");
        System.out.println("Divisão");
        for (int i = 1; i < 10; i++) {
            System.out.println(numeroDigitado + " / " + i + " = " + (numeroDigitado / i));
        }
    }
}
