package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public interface AcaoAposGerarPedido {
    public void executarPedido(Pedido pedido);
}