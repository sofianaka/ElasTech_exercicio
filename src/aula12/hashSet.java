package aula12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashSet {

    public static void main(String[] args) {
        //01
            Set<String> nomes = new HashSet<>();

        nomes.add("sara");
        nomes.add("sara");
        nomes.add("sofia");
        nomes.add("ana");

        for(String item: nomes){
            System.out.println(item);
        }
    int quantidade = nomes.size();
        System.out.println(quantidade);

        //02
        Set<String> cores = new HashSet<>();
        ArrayList<String> cores_novas = new ArrayList<>(Arrays.asList("lilas","rosa","marrom"));


        cores.add("verde");
        cores.add("amarelo");
        cores.add("amar");

         cores.addAll(cores_novas);

        if(cores.contains("verde")){
            System.out.println("A cor verde esta no conjunto");
        }else{
            System.out.println("A cor verde NÃO esta no conjunto");
        }

        //03
        ArrayList<String> nome = new ArrayList<>(Arrays.asList("sara","sofia","alice","sofia"));

        Set<String> semRepetidos = new HashSet<>(nome);
        System.out.println(nome);

        for( String lista:semRepetidos){
            System.out.println(lista);
        }
        //04
        Set<String> cpf = new HashSet<>();
        cpf.add("090.090.121.23");
        cpf.add("090.090.101.23");
        cpf.add("090.090.122.23");
        System.out.println(cpf.size());
        for(String cpfs : cpf){
            System.out.println(cpfs);

        }

        cpf.remove("090.090.121.23");
        System.out.println(cpf.size());


        //05
        Set<String> fruta = new HashSet<>();
        fruta.add("banaa");
        fruta.add("melancia");
        fruta.add("maça");
        for (String frutas: fruta){
            System.out.println(frutas);
        }

        //06
        Set<String> vazio = new HashSet<>();

        System.out.println( vazio.isEmpty());

        vazio.add("oi");
        System.out.println(vazio.isEmpty());







    }





}
