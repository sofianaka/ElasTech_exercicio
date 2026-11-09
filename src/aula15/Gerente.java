package aula15;

public class Gerente extends Funcionario implements Notificavel, Exportavel {

    public void aprovarFerias(String quem) {
        System.out.println(nome + " aprovou as férias de " + quem + ".");
    }

    @Override
    public void exportar() {
        System.out.println("Exportando dados do gerente " + nome + ".");
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + " enviou uma notificação: " + mensagem);
    }
}