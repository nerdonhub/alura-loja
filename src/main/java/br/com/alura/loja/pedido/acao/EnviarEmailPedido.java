package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{
    public void executarPedido(Pedido pedido) {
        System.out.println("Enviar email");
    }
}
