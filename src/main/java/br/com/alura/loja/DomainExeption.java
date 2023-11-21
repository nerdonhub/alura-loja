package br.com.alura.loja;

public class DomainExeption extends RuntimeException {
    public DomainExeption(String mensagem) {
        super(mensagem);
    }
}
