package desafio;

import java.math.BigDecimal;
import java.util.Scanner;

public class Desafio {

    static Scanner leitura = new Scanner(System.in);
    static String nome;
    static String tipoDeConta = "Corrente";
    static BigDecimal saldo = BigDecimal.ZERO;

    public static void main(String[] args) {

        int operacaoSelecionada = 0;

        System.out.println("Inicializando conta");

        System.out.println("Digite seu nome");
        nome = leitura.nextLine();

        System.out.println("Digite o saldo inicial");
        saldo = leitura.nextBigDecimal();

        System.out.println("**********************************************");
        System.out.println("Dados iniciais do cliente \n");
        System.out.println("Nome:                       " + nome);
        System.out.println("Tipo de conta:              " + tipoDeConta);
        System.out.println("Saldo inicial:              " + "R$ " + String.valueOf(saldo).replace(".", ","));
        System.out.println("********************************************** \n");

        System.out.println("Operações \n");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println();

        while (operacaoSelecionada != 4) {
            System.out.println("Digite a opção desejada:");
            operacaoSelecionada = leitura.nextInt();

            switch (operacaoSelecionada) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Não foi possivel identificar a opção escolhida \n");
            }
        }
    }

    public static void consultarSaldo() {
        System.out.println("O saldo atual é: R$ " + saldo + "\n");
    }

    public static void depositar() {
        System.out.println("Digite o valor do depósito: ");
        BigDecimal valorAcrescimo = leitura.nextBigDecimal();
        if (valorAcrescimo != null && valorAcrescimo.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.add(valorAcrescimo);
        } else {
            System.out.println("Valor inválido");
        }

        consultarSaldo();
    }

    public static void sacar() {
        System.out.println("Digite o valor sacado: ");
        BigDecimal valorSacado = leitura.nextBigDecimal();
        if (valorSacado != null && valorSacado.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.subtract(valorSacado);
        } else {
            System.out.println("Valor inválido");
        }

        consultarSaldo();
    }
}
