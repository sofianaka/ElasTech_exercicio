package aula08;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {

        mostraBoasVindas();

        Utilidades.nome("Ana");
        Utilidades.nome("Ana");
        Utilidades.nome("Ana");

        Utilidades.ola();
        Utilidades.olaNome("Sofia");


        int resultado = Utilidades.dobro(3);
        System.out.println(resultado);

        System.out.println("Soma"+  Utilidades.somar(1,2));
        System.out.println("Soma"+  Utilidades.somar(1,2,3));
        System.out.println("Soma"+  Utilidades.somar(2.3,30.2));


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 numeros ");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();


        double media = Utilidades.calcularMedia(numero1, numero2);
        System.out.printf("%.2f%n", media);

        System.out.println("Digite sua idade");

        int idade = sc.nextInt();

        if(Utilidades.ehMaiorIdade(idade)){
        System.out.println("Voce e maior de idade ");
        }else{
            System.out.println("Voce não e maior de idade  ");

        }

    }

    public static void mostraBoasVindas(){
        System.out.println("Bem vinda a curso de java");
    }
}
