package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoPorCincoItens {
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return BigDecimal.ZERO;
    }
}