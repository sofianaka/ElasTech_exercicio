package Petshop;

public class Consulta implements Servico {

    @Override
    public void executar(String nomePet) {
        System.out.println("Levando o " + nomePet + " para a consulta");
    }
}
