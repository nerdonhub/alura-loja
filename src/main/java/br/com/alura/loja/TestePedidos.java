package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvaPedidoBanco;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {
    public static void main(String[] args) {
        String cliente = "Gabriel";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvaPedidoBanco(),
                        new EnviarEmailPedido()
                ));
        handler.execute(gerador);
    }
}
