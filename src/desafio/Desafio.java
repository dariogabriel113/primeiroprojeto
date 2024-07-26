package desafio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {

    static Scanner leitura = new Scanner(System.in);
    static String nome;
    static String tipoDeConta = "Corrente";
    static BigDecimal saldo = BigDecimal.ZERO;

    public static void main(String[] args) {
        if (inicializaConta()) {
            extrato();
            chamaMenuOperacoes();
        } else {
            System.out.println("Reinicie o processo");
        }
    }

    public static boolean inicializaConta() {
        System.out.println("Inicializando conta \n");

        System.out.println("Digite seu nome");
        nome = leitura.nextLine();

        System.out.println("Digite o saldo inicial");
        try {
            BigDecimal valorInicial = leitura.nextBigDecimal();
            if (valorInicial != null && valorInicial.compareTo(BigDecimal.ZERO) >= 0) {
                saldo = valorInicial.setScale(2, RoundingMode.HALF_DOWN);
                return true;
            } else {
                exibieMsgValorInvalido();
            }
        } catch (InputMismatchException inputMismatchException) {
            leitura.nextLine();
            exibieMsgValorInvalido();
        }

        return false;
    }

    public static void exibieMsgValorInvalido() {
        System.out.println("Valor inválido \n");
    }

    public static void extrato() {
        System.out.println("**********************************************");
        System.out.println("Dados iniciais do cliente \n");
        System.out.println("Nome:                       " + nome);
        System.out.println("Tipo de conta:              " + tipoDeConta);
        System.out.println("Saldo inicial:              " + "R$ " + String.valueOf(saldo).replace(".", ","));
        System.out.println("********************************************** \n");
    }

    public static void chamaMenuOperacoes() {
        int operacaoSelecionada = 0;
        System.out.println("Operações \n");
        System.out.println("0- Extrato");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println();

        while (operacaoSelecionada != 4) {
            System.out.println("Digite a opção desejada:");

            try {
                operacaoSelecionada = leitura.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                exibieMsgValorInvalido();
                leitura.nextLine();
                operacaoSelecionada = 1;
            }

            switch (operacaoSelecionada) {
                case 0:
                    extrato();
                    break;
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
        BigDecimal valorAcrescimo = null;
        try {
            valorAcrescimo = leitura.nextBigDecimal();

            if (valorAcrescimo != null && valorAcrescimo.compareTo(BigDecimal.ZERO) > 0) {
                saldo = saldo.add(valorAcrescimo);
            } else {
                exibieMsgValorInvalido();
            }
        } catch (InputMismatchException inputMismatchException) {
            exibieMsgValorInvalido();
            leitura.nextLine();
        }

        consultarSaldo();
    }

    public static void sacar() {
        System.out.println("Digite o valor sacado: ");
        BigDecimal valorSacado = leitura.nextBigDecimal();
        if (valorSacado != null && valorSacado.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.subtract(valorSacado);
        } else {
            exibieMsgValorInvalido();
        }

        consultarSaldo();
    }
}
