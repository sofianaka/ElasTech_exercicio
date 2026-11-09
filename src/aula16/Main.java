package aula16;

public class Main {

    // Exercício 5: Método polimórfico genérico que aceita qualquer subclasse de Pessoa
    public static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    public static void main(String[] args) {

        // --- Exercício 1: Calculadora ---
        System.out.println("=== EXERCÍCIO 1 ===");
        Calculadora calc = new Calculadora();
        System.out.println("Área do quadrado (lado 4.0): " + calc.calcularArea(4.0));
        System.out.println("Área do retângulo (base 3.0, alt 5.0): " + calc.calcularArea(3.0, 5.0));
        System.out.println("Área do círculo (raio 2): " + calc.calcularArea(2));

        // --- Exercício 2: Painel ---
        System.out.println("\n=== EXERCÍCIO 2 ===");
        Painel painel = new Painel();
        painel.exibir("Olá mundo!");
        painel.exibir(42);
        painel.exibir(true);
        painel.exibir(19.90);

        // --- Exercício 3: Professora e Aluna ---
        System.out.println("\n=== EXERCÍCIO 3 ===");
        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 22;
        ana.curso = "Engenharia de Software";

        flora.apresentar();
        flora.lancarNota(ana.nome, 9.5);

        ana.apresentar();
        ana.estudar();

        // --- Exercício 4: Estagiária e Herança direta ---
        System.out.println("\n=== EXERCÍCIO 4 ===");
        Pessoa estagiaria = new Estagiaria();
        estagiaria.nome = "Camila";
        estagiaria.idade = 20;
        estagiaria.apresentar();

        // --- Exercício 5: Método polimórfico ---
        System.out.println("\n=== EXERCÍCIO 5 ===");
        mostrarFicha(ana);
        mostrarFicha(flora);
        mostrarFicha(estagiaria);

        // --- Exercício 6: Interface e Polimorfismo ---
        System.out.println("\n=== EXERCÍCIO 6 ===");
        MeioDePagamento forma;

        forma = new Pix();
        forma.pagar(150.00);

        forma = new Boleto();
        forma.pagar(150.00);
    }
}