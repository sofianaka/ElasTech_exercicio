package aula13;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        // 01 - Array normal com 4 nomes exibidos via for-each
        String[] nome = {"ana", "clara", "pedro", "roberta"};
        System.out.println("--- Exercicio 1 (for-each) ---");
        for (String n : nome) {
            System.out.println(n);
        }

        // 02 - ArrayList com 5 notas exibidas via for-each
        System.out.println("\n--- Exercicio 2 ---");
        ArrayList<Integer> notas = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        for (int nota : notas) {
            System.out.println(nota);
        }

        // 03 - Soma e media com for-each
        System.out.println("\n--- Exercicio 3 ---");
        int[] notas_new = {8, 6, 10, 7};
        int soma = 0;
        for (int nota : notas_new) {
            soma += nota;
        }
        double media = (double) soma / notas_new.length;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        // 04 - Contar nomes com mais de 5 letras (> 5)
        System.out.println("\n--- Exercicio 4 ---");
        String[] nomes_new = {"ana", "sofi", "carla", "roberta", "alexandre"};
        int totalMais5 = 0;

        for (String n : nomes_new) {
            if (n.length() > 5) {
                totalMais5++;
            }
        }
        System.out.println("Total de nomes com mais de 5 letras: " + totalMais5);

        // 05 - Exercicio 1 reescrito com for convencional (indice)
        System.out.println("\n--- Exercicio 5 (for normal com indice) ---");
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Indice " + i + ": " + nome[i]);
        }
    }
}