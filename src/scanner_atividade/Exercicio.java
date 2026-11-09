package scanner_atividade;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ///01
        System.out.println("Qual o seu nome");
        String nome = sc.next();
        System.out.println("Qual a sua idade ");
        int idade = sc.nextInt();
        int idadeprox = idade+1;

        System.out.println("Oi "+ nome+ " , voce tem "+ idade+ "e vai fazer "+idadeprox+ " no proximo aniversario ");

        //02
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double) num1 / num2;
        int resto = num1 % num2;

        System.out.println("\n--- Resultados ---");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + resto);

        //03
        System.out.print("Digite a nota da aluna (0 a 10): ");
        double nota = sc.nextDouble();

        System.out.println("\n--- Resultado ---");
        if (nota >= 7.0) {
            System.out.println("Situação: Aprovada");
        } else if (nota >= 5.0 && nota <= 6.9) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovada");
        }

        System.out.println("Digite um numero para a tabuada");
        int numero = sc.nextInt();

        for(int i=1; i <= 10; i++){
            System.out.println(numero+ " x "+i+" = "+ (numero*i) );

        }



    }
}
