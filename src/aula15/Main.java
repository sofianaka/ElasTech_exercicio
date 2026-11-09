package aula15;

public class Main {
    public static void main(String[] args) {

        // --- Exercícios 1 e 2: Herança simples com Aluna ---
        System.out.println("--- Exercícios 1 e 2 ---");
        Aluna aluna = new Aluna();
        aluna.nome = "Sofia";
        aluna.idade = 21;
        aluna.curso = "Artes";

        aluna.apresentar(); // Herdado de Pessoa
        aluna.estudar();    // Próprio de Aluna, usando atributo herdado (nome)

        // --- Exercícios 3 e 4: Professora com @Override e printf ---
        System.out.println("\n--- Exercícios 3 e 4 ---");
        Professora prof = new Professora();
        prof.nome = "Flora";
        prof.idade = 35;
        prof.disciplina = "História da Arte";

        prof.apresentar(); // Sobrescrito com @Override
        prof.lancarNota("Ana", 9.5);

        // --- Exercício 5: Herança em cadeia (Pessoa -> Funcionario -> Gerente -> Diretora) ---
        System.out.println("\n--- Exercício 5 ---");
        Diretora diretora = new Diretora();
        diretora.nome = "Carla";

        diretora.baterPonto();              // Veio de Funcionario
        diretora.aprovarFerias("Juliana");   // Veio de Gerente
        diretora.definirMeta("20% vendas"); // Próprio de Diretora

        // --- Exercício 6: 1 extends + múltiplas interfaces ---
        System.out.println("\n--- Exercício 6 ---");
        Gerente gerente = new Gerente();
        gerente.nome = "Carlos";

        gerente.baterPonto();               // de Funcionario
        gerente.aprovarFerias("Pamela");    // de Gerente
        gerente.notificar("Reunião às 15h"); // de Notificavel
        gerente.exportar();                 // de Exportavel
    }
}