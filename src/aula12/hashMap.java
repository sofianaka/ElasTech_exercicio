package aula12;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        //01
        Map<String,Integer> nome = new HashMap<>();

        nome.put("sofia",10);
        nome.put("carlos",12);
        nome.put("lila",3);

        System.out.println(nome);
        System.out.println("Idade da sofia "+ nome.get("sofia"));

        //02
        Map<String, Double>produtos = new HashMap<>();
        produtos.put("banana",5.0);
        System.out.println(produtos);
        System.out.println("tamanho "+produtos.size());


        produtos.put("banana",7.50);
        System.out.println(produtos);
        System.out.println("tamanho "+produtos.size());


        //03
        Map<String,String> agenda = new HashMap<>();
        agenda.put("Fer","0909090");
        agenda.put("sofi","097390");

        if(agenda.containsKey("Fer")){
            System.out.println("O nome tem na agenda "+agenda.get("Fer"));
        }else{
            System.out.println("Fer nao esta na agenda  ");

        }  if(agenda.containsKey("sofi")){
            System.out.println("O nome tem na agenda "+agenda.get("sofi"));
        }else{
            System.out.println("sofi nao esta na agenda  ");

        }


        //04
        Map<String,Integer> estoque = new HashMap<>();

        estoque.put("nutela",20);
        estoque.put("miojo",10);

        System.out.println("Nutela (getOrDefault): "+estoque.getOrDefault("nutela",20));
        System.out.println("Banana (getOrDefault): " +estoque.getOrDefault("banana",10));

        System.out.println("NUtela (get normal): " +estoque.get("nutela"));
        System.out.println("Banana (get normal): " +estoque.get("banana"));


        //05
        Map<String,Integer> notas = new HashMap<>();

        notas.put("clara",10);
        notas.put("lilica",5);
        notas.put("pudim",5);

        System.out.println("Tamanho"+notas.size());
        System.out.println("Tamanho"+notas.remove("clara",10));
        System.out.println("Tamanho"+notas.size());







    }
}

