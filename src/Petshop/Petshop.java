package Petshop;
import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

import static Petshop.Pet.*;

public class Petshop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        Pet[] pets = new Pet[5];
        ArrayDeque<String> fila = new ArrayDeque<>();
        int opcao = -1, total = 0;

        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());
        servicos.add(new Consulta());

        while (opcao !=0){
            System.out.println("=== PETSHOP ===");
            System.out.println("1 - cadastrar pet");
            System.out.println("2 - total pets");
            System.out.println("3 - buscar pet");
            System.out.println("4 - especie cadastrada");
            System.out.println("5 - entrar na fila de banho");
            System.out.println("6 - atender proximo");
            System.out.println("7 - executar servicos");
            System.out.println("8 - mostrar ficha");
            System.out.println("0 - sair");
            System.out.print("escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        pets[total] = cadastrar(sc);
                        total++;
                        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).\n");
                        break;
                    case 2:
                        listar(pets, total);
                        break;
                    case 3:
                        buscar(pets, total, sc);
                        break;
                    case 4:
                        especies(pets,total);
                        break;
                    case 5:
                        entrarNaFila(fila, sc);
                        break;
                    case 6:
                        atender(fila);
                        break;
                    case 7:
                        System.out.print("Nome do pet: ");
                        String nomePet = sc.nextLine();
                        for (Servico s : servicos) {
                            s.executar(nomePet);
                        }
                        System.out.println();
                        break;
                    case 8:
                        mostrarFichas(pets,total);
                        break;
                    case 0:
                        System.out.println("Atee");
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                }
            }catch (InputMismatchException e) {
                System.out.println("Digite apenas números!\n");
                sc.nextLine();
            }

        }

//        System.out.println("=== FICHA DO PET ===");
//        System.out.println("Nome: "+ pet.nome);
//        System.out.println("Especie: "+ pet.especie);
//        System.out.println("Peso: "+pet.peso);
//        System.out.println("Porte: "+pet.porte);



    }


}
