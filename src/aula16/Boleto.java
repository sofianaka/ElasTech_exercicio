package aula16;

public class Boleto implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto bancário emitido no valor de R$ %.2f%n", valor);
    }
}