package aula14;

import java.util.ArrayList;
import java.util.List;

public class Interfaces {
    public static void main(String[] args) {

        // --- Exercício 1 e 2: Polimorfismo com referências da Interface ---
        System.out.println("--- Exercícios 1 e 2 ---");
        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();

        // --- Exercício 3: Percorrendo lista de animais sem if ---
        System.out.println("\n--- Exercício 3 ---");
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal bichinho : animais) {
            bichinho.emitirSom(); // Chama o método polimórfico
        }

        // --- Exercício 4: Notificações em lista com for-each ---
        System.out.println("\n--- Exercício 4 ---");
        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new Sms());

        String mensagem = "Sua compra foi aprovada!";
        for (Notificacao n : notificacoes) {
            n.enviar(mensagem);
        }

        // --- Exercício 5: Veículos com múltiplos métodos ---
        System.out.println("\n--- Exercício 5 ---");
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Moto());
        veiculos.add(new Carro());

        for (Veiculo transporte : veiculos) {
            transporte.ligar();
            transporte.acelerar();
        }
    }

    // Classes do Exercício 1 e 2
    public static class Cachorro implements Animal {
        @Override
        public void emitirSom() {
            System.out.println("Au au!");
        }
    }

    public static class Gato implements Animal {
        @Override
        public void emitirSom() {
            System.out.println("Miau!");
        }
    }

    // Classes do Exercício 4 (nomes com PascalCase)
    public static class Sms implements Notificacao {
        @Override
        public void enviar(String mensagem) {
            System.out.println("SMS enviado: " + mensagem);
        }
    }

    public static class Email implements Notificacao {
        @Override
        public void enviar(String mensagem) {
            System.out.println("E-mail enviado: " + mensagem);
        }
    }

    // Classes do Exercício 5
    public static class Moto implements Veiculo {
        @Override
        public void ligar() {
            System.out.println("Ligando moto");
        }

        @Override
        public void acelerar() {
            System.out.println("Acelerando moto");
        }
    }

    public static class Carro implements Veiculo {
        @Override
        public void ligar() {
            System.out.println("Ligando carro");
        }

        @Override
        public void acelerar() {
            System.out.println("Acelerando carro");
        }
    }
}