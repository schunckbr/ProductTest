package br.com.coursera.produto.models;

import org.junit.Assert;

public class Main {

    public static void main(String[] args) {
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	// estes produtos possuem o mesmo codigo
	Produto canetaAzul = new Produto("Caneta Azul", 01, 10.00);
	Produto canetaPreta = new Produto("Caneta Preta", 01, 3.50);

	carrinho.adicionaProduto(canetaAzul, 2);
	carrinho.adicionaProduto(canetaPreta, 10);

	System.out.println("Teste : " + canetaAzul);
    }

}
