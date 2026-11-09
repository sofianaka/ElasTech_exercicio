package aula16;

public class Pix implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via PIX realizado no valor de R$ %.2f%n", valor);
    }
}