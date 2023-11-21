package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvaPedidoBanco implements AcaoAposGerarPedido{
    public void executarPedido(Pedido pedido) {
        System.out.println("Salvar pedido");
    }
}
