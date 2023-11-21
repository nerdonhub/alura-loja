package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    // construtor com injenção de depedências e tal (repository, serve, etc)

    private List<AcaoAposGerarPedido> acoes;
    public GeraPedidoHandler (List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public GeraPedidoHandler() {
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(
                dados.getCliente(),
                LocalDateTime.now(),
                orcamento
        );
        acoes.forEach(a -> a.executarPedido(pedido));
    }
}
