package classes;

import java.util.Scanner;

public class DescubraNumeroMaior {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Integer primeiroNumero = null;
        Integer segundoNumero = null;

        System.out.println("Digite o primeiro número");
        primeiroNumero = leitura.nextInt();

        if (primeiroNumero != null) {
            System.out.println("Digite o segundo número");
            segundoNumero = leitura.nextInt();

            if (segundoNumero != null) {
                String mensagem = "Os números são iguais";

                if (primeiroNumero > segundoNumero) {
                    mensagem = "O primeiro número é maior";
                } else if (primeiroNumero < segundoNumero) {
                    mensagem = "O segundo número é maior";
                }

                System.out.println(mensagem);
            }
        }
    }
}
