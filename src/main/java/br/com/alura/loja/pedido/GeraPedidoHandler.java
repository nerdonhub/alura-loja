package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    // construtor com injenção de depedências e tal (repository, serve, etc)
    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(
                dados.getCliente(),
                LocalDateTime.now(),
                orcamento
        );
    }
}
