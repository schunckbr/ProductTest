package br.com.coursera.produto.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.coursera.produto.models.CarrinhoDeCompras;
import br.com.coursera.produto.models.Produto;

public class TesteCarrinhoDeCompras {

    @Test
    public void testeAdicionaProduto() {

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	// estes produtos possuem o mesmo codigo
	Produto canetaAzul = new Produto("Caneta Azul", 01, 10.00);
	Produto canetaPreta = new Produto("Caneta Preta", 01, 3.50);

	carrinho.adicionaProduto(canetaAzul, 2);
	carrinho.adicionaProduto(canetaPreta, 10);

	Assert.assertEquals(12, carrinho.getQtd());

    }

    @Test
    public void testeProdutoTotalCarrinho() {

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	Produto canetaAzul = new Produto("Caneta Azul", 01, 4.50);
	Produto canetaPreta = new Produto("Caneta Preta", 01, 4.50);
	Produto apontador = new Produto("Apontador", 02, 8.00);
	Produto lapiseira = new Produto("Lapiseira", 03, 15.00);

	carrinho.adicionaProduto(canetaAzul, 20);
	carrinho.adicionaProduto(canetaPreta, 10);
	carrinho.adicionaProduto(canetaPreta, 45);
	carrinho.adicionaProduto(apontador, 34);
	carrinho.adicionaProduto(lapiseira, 5);

	Assert.assertEquals(684.50, carrinho.getValorTotalDoCarrinho(), 0.00001);
    }

    @Test
    public void testeRemoveProdutoDoCarrinho() {

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	Produto caneta1 = new Produto("Caneta Azul", 01, 4.50);
	Produto caneta2 = new Produto("Caneta Preta", 01, 4.50);
	Produto apontador = new Produto("Apontador", 02, 8.00);
	Produto lapiseira = new Produto("Lapiseira", 03, 15.00);

	carrinho.adicionaProduto(caneta2, 1);
	carrinho.adicionaProduto(caneta1, 1);
	carrinho.adicionaProduto(apontador, 1);
	carrinho.adicionaProduto(lapiseira, 2);

	Assert.assertEquals(3, carrinho.getProdutos().size());
	carrinho.removeProduto(lapiseira, 2);
	Assert.assertEquals(2, carrinho.getProdutos().size());
    }

}
