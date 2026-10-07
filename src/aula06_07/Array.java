package aula06_07;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // 1 crie um array

        String [] nome = {"sofia","ana","sara","pudim","lilica"};

        System.out.println(nome[0]);
        System.out.println(nome[3]);
        System.out.println(nome[4]);

        //crie um array com as noas

        int [] numeros = {8,6,10,7,9};
        int soma = 0;
        int media=0;

        for(int i=0; i<numeros.length;i++){
            System.out.println("Nota:"+numeros[i]);
            soma+=numeros[i];
            media+= numeros[i]/ numeros.length;


        }
        System.out.println("media = "+media);
        System.out.println("soma =  "+soma);


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 nuemros inteiros");

        int[] numero =new int[5];

        for (int i=0;i< numero.length;i++){
            numero[i] = sc.nextInt();
        }
        System.out.println("Seus numeros digitados de tras para frente");

        for(int i =numero.length-1; i>=0;i--){
            System.out.println("Numero "  + i +" : " + numero[i]);

        }












        sc.close();







    }
}
