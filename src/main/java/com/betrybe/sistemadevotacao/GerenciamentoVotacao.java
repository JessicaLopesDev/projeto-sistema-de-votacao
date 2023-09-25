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
    cpfsComputados.forEach(cpf -> {
      if (cpfPessoaEleitora == cpf) {
        System.out.println("Pessoa eleitora já votou!");
      }
    });
    pessoasCandidatas.forEach(candidato -> {
      if (numeroPessoaCandidata == candidato.getNumero()) {
        candidato.receberVoto();
      }
    });
    cpfsComputados.add(cpfPessoaEleitora);
  }

  @Override
  public void mostrarResultado() {
    if (cpfsComputados.size() == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }
    pessoasCandidatas.forEach(candidato -> {
      int total = (candidato.getVotos() * 100) / cpfsComputados.size();
      System.out.println("Nome: " + candidato.getNome() + " - " + candidato.getVotos()
          + " votos ( " + Math.round(total) + "% )");
    });
    System.out.println("Total de votos: " + cpfsComputados.size());
  }
}
