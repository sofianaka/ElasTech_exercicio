package aula17;

public class Produto {
    private String codigoInterno = "X-99"; // Só visível dentro de Produto
    String nome = "Caneta";                // default: visível dentro do mesmo pacote
    public double preco = 5.50;            // público: visível de qualquer lugar
}