package com.betrybe.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean cadastrandoCandidato = true;
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();

    while (cadastrandoCandidato) {
      System.out.println("Cadastrar pessoa candidata?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada: ");
      int option = Integer.parseInt(scanner.nextLine());
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa candidata: ");
        String nomeCandidato = scanner.nextLine();

        System.out.println("Entre com o número da pessoa candidata: ");
        int numeroCandidato = Integer.parseInt(scanner.nextLine());
        votacao.cadastrarPessoaCandidata(nomeCandidato, numeroCandidato);
      } else {
        cadastrandoCandidato = false;
      }
    }

    boolean cadastrandoEleitor = true;
    while (cadastrandoEleitor) {
      System.out.println("Cadastrar pessoa eleitora?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada: ");
      int option = Integer.parseInt(scanner.nextLine());
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa eleitora: ");
        String nomeEleitor = scanner.nextLine();

        System.out.println("Entre com o número da pessoa eleitora: ");
        String cpfEleitor = scanner.nextLine();
        votacao.cadastrarPessoaEleitora(nomeEleitor, cpfEleitor);
      } else {
        cadastrandoEleitor = false;
      }
    }
  }
}
