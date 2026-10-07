package aula04;

public class ExercicioConcatenação {
    public static void main(String[] args) {

        // 1
        String nome = "Sofia";
        String cidade = "Belém";
        int idade = 21;

        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");


        // 2
        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;

        double total = preco * quantidade;

        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + total);


        // 3
        int numero1 = 15;
        int numero2 = 4;

        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2+ " é igual a " + soma + ".");


        // ARITMÉTICOS

        // 0
        System.out.println("2 + 2 = " + 2 + 2);

        System.out.println("2 + 2 = " + (2 + 2));


        // 1
        int a = 10;
        int b = 3;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));


        // 2
        double decimalA = 10;
        double decimalB = 3;

        System.out.println("Soma decimal: " + (decimalA + decimalB));
        System.out.println("Subtração decimal: " + (decimalA - decimalB));
        System.out.println("Multiplicação decimal: " + (decimalA * decimalB));
        System.out.println("Divisão decimal: " + (decimalA / decimalB));
        System.out.println("Resto decimal: " + (decimalA % decimalB));


        // 3
        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;

        double somaNotas = nota1 + nota2 + nota3;
        double media = somaNotas / 3;

        System.out.println("A soma das notas é: " + somaNotas);
        System.out.println("A média das notas é: " + media);


        // 4
        int a4 = 3;
        int b4 = 4;
        int c4 = 5;

        int resultado4 = a4 + b4 * c4;

        System.out.println("O resultado de a + b * c é: " + resultado4);


        // 5
        int a5 = 3;
        int b5 = 4;
        int c5 = 5;

        int resultado5 = (a5 + b5) * c5;

        System.out.println("O resultado de (a + b) * c é: " + resultado5);


        // final
        int segundos = 3785;

        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("3785 segundos correspondem a " + minutos + " minutos e "+segundosRestantes + " segundos.");
    }
}
