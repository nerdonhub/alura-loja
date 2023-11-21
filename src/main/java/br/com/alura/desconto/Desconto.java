package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    protected Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
    public abstract BigDecimal calcular(Orcamento orcamento);
}
