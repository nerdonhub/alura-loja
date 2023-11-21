package br.com.alura.loja.orcamento;


public class EmAnalise extends SituacaoOrcamento{
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
