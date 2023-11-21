package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento{
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
