package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public abstract class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<String> pessoasCandidatas = new ArrayList<>();
  private ArrayList<String> pessoasEleitoras = new ArrayList<>();
  private ArrayList<String> cpfsComputados = new ArrayList<>();
}
