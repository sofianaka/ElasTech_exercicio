package Petshop;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;

public  class Pet {

        String nome, especie, porte;
        double peso;

        void emitirSom() {
            System.out.println(nome + " faz um som.");
        }

        static Pet cadastrar(Scanner sc) {
            System.out.println("Qual o nome do seu pet?");
            String nome = sc.next();
            System.out.println("Qual a especie do seu pet? (cachorro, gato ou outro)");
            String especie = sc.next();

            Pet pet;
            if (especie.equalsIgnoreCase("cachorro")) {
                pet = new Cachorro();
            } else if (especie.equalsIgnoreCase("gato")) {
                pet = new Gato();
            } else {
                pet = new Pet();
            }

            pet.nome = nome;
            pet.especie = especie;
            System.out.println("Qual o peso do seu pet?");
            pet.peso = sc.nextDouble();
            sc.nextLine();
            pet.porte = pet.descobriPorte();

            return pet;
        }

    public String descobriPorte(){
        if(peso<10){
            return "pequeno";
        } else if (peso<25) {
            return "medio";
        }else{
            return "Grande";
        }
    }



    public static void listar(Pet[] pets, int total) {
        if (total == 0) {
            System.out.println("Nenhum pet cadastrado.\n");
            return;
        }
        System.out.println("\n--- PETS CADASTRADOS ---");
        for (int i = 0; i < total; i++) {
            System.out.println(pets[i].nome + " (" + pets[i].especie + ") - "
                    + pets[i].peso + " kg - Porte " + pets[i].porte);
            pets[i].emitirSom();

        }
        System.out.println();
    }

    public static void buscar(Pet[] pets, int total, Scanner sc) {
        System.out.print("Qual pet você procura? ");
        String busca = sc.nextLine();
        boolean achou = false;

        for (int i = 0; i < total; i++) {
            if (pets[i].nome.equalsIgnoreCase(busca)) {
                System.out.println("Encontrado: " + pets[i].nome + " (" + pets[i].especie + ") - "
                        + pets[i].peso + " kg\n");
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Pet não encontrado.\n");
        }
    }
    static void especies(Pet[] pets, int total) {
        HashSet<String> especies = new HashSet<>();
        for (int i = 0; i < total; i++) {
            especies.add(pets[i].especie);
        }

        System.out.println("\n--- ESPÉCIES CADASTRADAS ---");
        for (String especie : especies) {
            System.out.println("- " + especie);
        }
        System.out.println("Total de espécies diferentes: " + especies.size() + "\n");
    }

    static void entrarNaFila(ArrayDeque<String> fila, Scanner sc) {
        System.out.print("Nome do pet pra entrar na fila: ");
        String nome = sc.nextLine();
        fila.add(nome);
        System.out.println(nome + " entrou na fila.");
        System.out.println("Fila agora: " + fila + "\n");
    }

    static void atender(ArrayDeque<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.\n");
            return;
        }
        System.out.println("Próximo da fila: " + fila.peek());
        System.out.println("Atendendo " + fila.poll() + "...");
        System.out.println("Fila agora: " + fila + "\n");
    }

    void mostrarFicha() {
        System.out.println("Nome: " + nome);
    }

    void mostrarFicha(String titulo) {
        System.out.println(titulo);
        mostrarFicha();
        System.out.println("Espécie: " + especie);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Porte: " + porte);
    }

    static void mostrarFichas(Pet[] pets, int total) {
        if (total == 0) {
            System.out.println("Nenhum pet cadastrado.\n");
            return;
        }
        for (int i = 0; i < total; i++) {
            pets[i].mostrarFicha();
            System.out.println("---");
            pets[i].mostrarFicha("=== FICHA DO PET ===");
            System.out.println();
        }
    }
    }
