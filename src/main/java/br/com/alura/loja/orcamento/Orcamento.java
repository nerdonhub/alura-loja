package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private int quantidadeItens;
    private BigDecimal valor;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    // MÉTODOS RELACIONADOS AO DESCONTO (APROVAR, REPROVAR E FINALIZAR)
    public void aprovar() {
        this.situacao.aprovar(this);
    }
    public void reprovar() {
        this.situacao.reprovar(this);
    }
    public void finalizar() {
        this.situacao.finalizar(this);
    }
    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }

    // GETTERS
    public int getQuantidadeItens() {
        return quantidadeItens;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    // SETTERS
    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}