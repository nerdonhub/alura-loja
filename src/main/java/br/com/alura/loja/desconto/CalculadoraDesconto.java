package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoPorCincoItens(
                new DescontoPorMaiorQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}