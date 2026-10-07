package aula04;

import aula05.Animal;

public class If_Else {
    public static void main(String[] args) {
        double saldo = 500.00;
        double compra = 320.00;

        if (saldo >= compra) {
            double saldoRestante = saldo - compra;

            System.out.println("Compra aprovada!");
            System.out.printf("Saldo restante: R$ %.2f%n", saldoRestante);
        } else {
            double faltando = compra - saldo;

            System.out.println("Saldo insuficiente");
            System.out.printf("Esta faltando: R$ %.2f%n", faltando);
        }


        Animal gato = new Animal();

        gato.nome = "lilica";
    }
}
