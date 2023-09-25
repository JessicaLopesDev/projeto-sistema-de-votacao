package com.betrybe.sistemadevotacao;

/**
 * PessoaCandidata.
 */
public class PessoaCandidata extends Pessoa {

  protected int numero;
  protected int votos;
  /**
   * Construtor PessoaCandidata.
   */

  public PessoaCandidata(String nome, int numero) {
    super.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
