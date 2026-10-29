package estruturaDecisao;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        ///01
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade ?");
        int idade = sc.nextInt();

        if (idade < 13) {
            System.out.println("CRIANÇA");

        } else if (idade >= 13 && idade <= 17) {
            System.out.println("ADOLESCENTE");

        } else if (idade >= 18 && idade <= 59) {
            System.out.println("ADULTO");

        } else {
            System.out.println("IDOSO");

        }
        ///02
        double saldo = 500.0;

        double valor_compra = 300.0;

        if (saldo > valor_compra) {
            double saldoRestante = saldo - valor_compra;
            System.out.println("compra aprovada");

        }else {
            double valor_faltante = valor_compra - saldo;
            System.out.println("Saldo inuficienete "+ valor_faltante);

        }

        ///03
        System.out.println("Digite uma opcao");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("CAFE");
                break;

            case 2:
                System.out.println("CAPPUCINO");
                break;

            case 3:
                System.out.println("CHOCOLATE QUENTE");
                break;

            case 4:
                System.out.println("CHA");
                break;
            default:
                System.out.println("OPCAO INVALIDA");
                break;


        }
        ///04
        int idade1 = 17;
        boolean temAutorizacao = true;

        if (idade >= 18 || temAutorizacao) {
            System.out.println("Pode entrar na festa!");
        } else {
            System.out.println("Entrada negada!");
        }


        if (idade >= 18 && temAutorizacao) {
            System.out.println("Pode entrar na festa!");
        } else {
            System.out.println("Entrada negada!");
        }



        /// 05
        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("Média final: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovada");
        } else if (media >= 5.0) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovada");
        }

    }
}
