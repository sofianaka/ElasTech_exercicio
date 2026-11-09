package aula17;

public class ContaBancaria {
    // 1 e 6: Atributos privados (
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    // --- 2: Getters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // 6: Getter para numeroConta
    public String getNumeroConta() {
        return numeroConta;
    }

    // --- 3: Setter com validação
    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }

    // --- 4: Métodos Públicos
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        this.saldo += valor;
        registrarLog("deposito de " + valor);
        System.out.println("Saldo: " + this.saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        if (!temSaldo(valor)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        registrarLog("saque de " + valor);
        System.out.println("Saldo: " + this.saldo);
    }

    // --- 4: Métodos Privados
    private boolean temSaldo(double valor) {
        return this.saldo >= valor;
    }

    private void registrarLog(String acao) {
        System.out.println("[LOG] " + this.titular + ": " + acao);
    }
}