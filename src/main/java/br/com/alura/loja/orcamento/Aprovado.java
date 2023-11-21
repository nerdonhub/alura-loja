package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainExeption;

import java.math.BigDecimal;

public class Aprovado  extends SituacaoOrcamento{
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
