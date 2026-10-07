package aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {


        int resultado;
        //01
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros");
        int num1 =  sc.nextInt();
        System.out.println("Digite dois numeros");
        int num2 =  sc.nextInt();
        try{
            resultado = num1/num2;
            System.out.println("Resultado"+resultado);
        }catch (ArithmeticException e){
            System.out.println("Nao pode dividir por zero");
        }



        //02

        int[] numero =new int[5];

        for(int i=0; i<numero.length;i++){
            numero[i] = sc.nextInt();
        }
        try{
            System.out.println("Escolha um posição no array");
            int posicao = sc.nextInt();
            System.out.println("A posicao"+posicao+" e o numero:"+numero[posicao]);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("O array vai so de 0 a 4");

        }


        //03
        System.out.println("Digite sua idade");


        try{
            int idade = sc.nextInt();
            System.out.println("Sua idade"+ idade);
        }catch (InputMismatchException e){
            System.out.println("voce digitou uma palavra digite um nuemro");


        }

        //04
        try {
            String nome = null;
            System.out.println(nome.length());
        }catch (NullPointerException e ){
            System.out.println(" o Nome nao foi preenchido");
        }

        //05
        double resto;
        System.out.println("Digite um numero");
        int numeros = sc.nextInt();

        try{
            resto = 100%numeros;
            System.out.println("O resto da divisao desse numero é"+resto);
        }catch (ArithmeticException e){
            System.out.println("Digite um numero que nao seja 0");
        }


        //06

        String [] nomes = {"Sofia","alice","miyuki"};

        try{
            System.out.println(nomes[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Essas posição nao existe");
        }

        System.out.println("O progama continua funcionando ");
    }
}
