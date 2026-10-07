package aula06_07;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {


                Scanner entrada = new Scanner(System.in);

                // 1 - Contar caracteres do nome
                System.out.print("Digite seu nome completo: ");
                String nome = entrada.nextLine();

                System.out.println("Quantidade de caracteres: " + nome.length());


                // 2 - maiusculo e minusculo
                System.out.print("\nDigite seu nome: ");
                nome = entrada.nextLine();

                System.out.println("Nome em maiúsculo: " + nome.toUpperCase());
                System.out.println("Nome em minúsculo: " + nome.toLowerCase());


                // 3- primeira letra do nome
                System.out.print("\nDigite seu nome: ");
                nome = entrada.nextLine();

                System.out.println("Primeira letra: " + nome.charAt(0));


                // 4 -verificar se a palavra java aparece na frase
                    System.out.print("Digite uma frase: ");
                    String frase = entrada.nextLine();

                    System.out.print("Digite uma palavra: ");
                    String palavra = entrada.nextLine();

                    System.out.println("A palavra aparece na frase? " + frase.contains(palavra));



        // 5- verificar se os nomes sao iguais
                System.out.print("\nDigite o primeiro nome: ");
                String nome1 = entrada.nextLine();

                System.out.print("Digite o segundo nome: ");
                String nome2 = entrada.nextLine();

                System.out.println("Os dois nomes são iguais? " + nome1.equalsIgnoreCase(nome2));

                entrada.close();
            }
        }

