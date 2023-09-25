package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * GerenciamentoVotacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private ArrayList<String> cpfsComputados = new ArrayList<>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    pessoasCandidatas.forEach(canditado -> {
      if (numero == canditado.getNumero()) {
        System.out.println("Número da pessoa candidata já utilizado!");
      }
    });
    PessoaCandidata novaPessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(novaPessoaCandidata);
  }

  /**
   * CadastrarEleitor.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    pessoasEleitoras.forEach(eleitor -> {
      if (cpf == eleitor.getCpf()) {
        System.out.println("Pessoa eleitora já cadastrada!");
      }
    });
    PessoaEleitora novaPessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(novaPessoaEleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}
