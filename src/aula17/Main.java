package aula17;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== EXERCÍCIO 1 e 2 ===");
        ContaBancaria c = new ContaBancaria();

        // [EXERCÍCIO 1] As duas linhas abaixo causam erro de compilação:
        // System.out.println(c.titular); // error: titular has private access in ContaBancaria
        // c.saldo = -5000;              // error: saldo has private access in ContaBancaria

        // [EXERCÍCIO 2] Lendo via getters:
        System.out.println("Titular: " + c.getTitular());
        System.out.println("Saldo: " + c.getSaldo());


        System.out.println("\n=== EXERCÍCIO 3 ===");
        c.setTitular("");        // Tentativa inválida
        c.setTitular("Ana");     // Válido
        System.out.println("Titular: " + c.getTitular());


        System.out.println("\n=== EXERCÍCIO 4 ===");
        c.depositar(500.0);   // Aceita e gera LOG
        c.depositar(-100.0);  // Recusa
        c.sacar(2000.0);      // Recusa por saldo insuficiente
        c.sacar(200.0);       // Aceita e gera LOG

        // Tentar chamar metodo privado causa erro:



        System.out.println("\n=== EXERCÍCIO 5 ===");
        Produto p = new Produto();

        System.out.println(p.nome);  // Funciona (default, mesmo pacote)
        System.out.println(p.preco); // Funciona (public)


        System.out.println("\n=== EXERCÍCIO 6 ===");
        System.out.println("Numero da conta: " + c.getNumeroConta());


    }
}