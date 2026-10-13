package aula12;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Deque;

public class arrayDeque {
    public static void main(String[] args) {

        //01
        Queue<String> nome = new ArrayDeque<>();

        nome.add("ana");
        nome.add("sara");
        nome.add("pudim");

        for(String nomes :nome){
            System.out.println(nomes);
        }
        System.out.println("Total de nomes "+nome.size());

        //02
        Queue<String>fila = new ArrayDeque<>();

        fila.addAll(List.of("fernanda","carolina","bia"));
        System.out.println("Proximo"+fila.peek());
        System.out.println("Fila:"+fila);


        //03
        System.out.println("primeiro"+fila.poll());
        System.out.println("Fila:"+fila);


        //04
        Deque<String> pilhas = new ArrayDeque<>();

        pilhas.add("lilica");
        pilhas.add("kiki");
        System.out.println("Atendimentos:"+pilhas);
        while(!pilhas.isEmpty()){
            System.out.println("Atendendo  "+pilhas.pop());
        }

        //05
        System.out.println("Bia esta na fila "+ fila.contains("Bia"));
        System.out.println("Zoe esta na fila "+ fila.contains("zoe"));


        //06
        Deque<String> fila_nova = new ArrayDeque<>();
        verificarFila(fila_nova);

        fila_nova.add("Ana");

        verificarFila(fila_nova);


    }

    public static void verificarFila(Deque <String> fila){
        if (fila.isEmpty()){
            System.out.println("não tem nimguem na fila");
        }else{
            System.out.println("Proximo: "+fila.peek());
        }
    }
}
