package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Cachorro");
            System.out.println("2 - Cadastrar Gato");
            System.out.println("3 - Cadastrar Furão");
            System.out.println("4 - Exibir Animais");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cachorro: ");
                    String nomeCachorro = scanner.nextLine();
                    System.out.print("Tamanho do cachorro: ");
                    int tamanhoCachorro = scanner.nextInt();
                    System.out.print("Idade do cachorro: ");
                    int idadeCachorro = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Raça do cachorro: ");
                    String raca = scanner.nextLine();
                    animais.add(new Cachorro(nomeCachorro, idadeCachorro,tamanhoCachorro ,raca));
                    System.out.println("Cachorro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do gato: ");
                    String nomeGato = scanner.nextLine();
                    System.out.print("Tamanho do gato: ");
                    int tamanhoGato = scanner.nextInt();
                    System.out.print("Idade do gato: ");
                    int idadeGato = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Cor do pelo do gato: ");
                    String corPelo = scanner.nextLine();
                    animais.add(new Gato(nomeGato, idadeGato,tamanhoGato, corPelo));
                    System.out.println("Gato cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Nome do furão: ");
                    String nomeFurao = scanner.nextLine();
                    System.out.print("Tamanho do furão: ");
                    int tamanhoFurao = scanner.nextInt();
                    System.out.print("Idade do furão: ");
                    int idadeFurao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Cor do pelo do furão: ");
                    String corRaca = scanner.nextLine();
                    animais.add(new Furão(nomeFurao, idadeFurao, tamanhoFurao, corRaca));
                    System.out.println("Furão cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("\n=== Lista de Animais ===");
                    for (Animal animal : animais) {
                        animal.exibirInfo();
                        System.out.println("------------------------");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}

