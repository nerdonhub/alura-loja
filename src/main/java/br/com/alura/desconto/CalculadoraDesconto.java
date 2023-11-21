package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoPorCincoItens(
                new DescontoPorMaiorQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
