package aula11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //01

        ArrayList<String> lista_nomes= new ArrayList<>();

        lista_nomes.add("Alice");
        lista_nomes.add("Pedro");
        lista_nomes.add("Lilica");


        for (String nome: lista_nomes){
            System.out.println(nome);

        }



        //02
        ArrayList<String>lista_fruta = new ArrayList<>(Arrays.asList("banana","maça","uva"));

        System.out.println(lista_fruta.indexOf(0));
        System.out.println(lista_fruta.indexOf(2));
        System.out.println(lista_fruta.size());



        //03
        ArrayList<String>lista_no = new ArrayList<>(Arrays.asList("sara","sofia","miyuki","karla"));

        for(String nomes:lista_no){
            System.out.println(nomes);
        }
        lista_no.set(2,"Ana");

        for(String nomes: lista_no){
            System.out.println(nomes);

        }


        //04- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

        ArrayList<String>list_cidades = new ArrayList<>();
        list_cidades.add("benevides");
        list_cidades.add("belem");
        list_cidades.add("castanhal");
        list_cidades.add("santa izabel");

        list_cidades.remove(1);

        for(String cidades:list_cidades){
            System.out.println(cidades);
        }

        //05
        // - Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)


        ArrayList<String>list_new = new ArrayList<>();

        list_new.add("ana");
        list_new.add("beatriz");
        list_new.add("fernanda");
        list_new.add("antonia");
        list_new.add("roberto");
        list_new.add("patricia");

        for(int i=0; i<list_new.size(); i++){
            System.out.println(i+":"+list_new.get(i));
        }


        // - Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.



        System.out.println("Digite um nome para ve se esta na lista");
        String nome = sc.next().toLowerCase();//ignora as letras maiusculas e minusculas digitadas pelo usuario

        if(list_new.contains(nome)){
        System.out.println(nome+"posicao"+list_new.indexOf(nome));
        }else{
            System.out.println("O nome que voce digitou"+ nome+ "Nao esta na lista ");
        }
















    }
}
