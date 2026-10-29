package OperadorRelacional;

public class Atividade {
    public static void main(String[] args) {
        double a = 10;
        double b = 3;

        System.out.println("Para a = 10 e b = 3:");
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));

        a = 3;
        b = 10;
        System.out.println("\nPara a = 3 e b = 10:");
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));


        a = 5;
        b = 5;
        System.out.println("\nPara a = 5 e b = 5:");
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));


        System.out.println("\n=== EXERCÍCIO 2 ===");
        int n1 = 10;
        int n2 = 3;
        System.out.println(n1 == n2);

        System.out.println("\n=== EXERCÍCIO 3 ===");
        System.out.println(n1 != n2);


        System.out.println("\n=== EXERCÍCIO 4 ===");
        boolean chovendo = true;
        System.out.println(!chovendo);

    }

}
