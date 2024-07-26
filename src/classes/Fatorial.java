package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroDigitado = 1;
        int resultado = 1;

        System.out.println("Digite um número positivo para exibir o seu fatorial");
        numeroDigitado = leitura.nextInt();

        List<Integer> numerosEncontrados = new ArrayList<>();
        if (numeroDigitado >= 0) {
            for (int i = numeroDigitado; i > 0; i--) {
                resultado = resultado * i;
                numerosEncontrados.add(i);
            }

            String sequencia = !numerosEncontrados.isEmpty() ? " = " + numerosEncontrados.stream().map(String::valueOf).collect(Collectors.joining("x", "", "")) : "";
            System.out.println("!" + numeroDigitado + sequencia + " = " + resultado);
        } else {
            System.out.println("Número inválido");
        }
    }
}
