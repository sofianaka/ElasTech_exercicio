package aula15;

public class Professora extends Pessoa {
    String disciplina;

    @Override
    public void apresentar() {
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");
    }

    public void lancarNota(String aluna, double nota) {
        // Uso do printf com %.1f conforme pedido no exercício 3
        System.out.printf("%s lançou nota %.1f para %s%n", nome, nota, aluna);
    }
}