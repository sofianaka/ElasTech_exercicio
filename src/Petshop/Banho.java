package Petshop;

public class Banho implements Servico {
    @Override
    public void executar(String nomePet) {
        System.out.println("A Pet: "+ nomePet+ " esta tomando banho ");

    }
}
