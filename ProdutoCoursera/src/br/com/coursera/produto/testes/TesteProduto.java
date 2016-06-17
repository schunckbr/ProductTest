package br.com.coursera.produto.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.coursera.produto.models.CarrinhoDeCompras;
import br.com.coursera.produto.models.Produto;

public class TesteProduto {

    @Test
    public void testeProdutoIguais() {

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	// canetaAzul e CanetaPreta possuem o mesmo codigo 01
	Produto canetaAzul = new Produto("Caneta Azul", 01, 4.50);
	Produto canetaPreta = new Produto("Caneta Preta", 01, 4.50);
	Produto apontador = new Produto("Apontador", 02, 8.00);
	Produto lapiseira = new Produto("Lapiseira", 03, 15.00);

	carrinho.adicionaProduto(canetaAzul, 20);
	carrinho.adicionaProduto(canetaPreta, 10);
	carrinho.adicionaProduto(canetaPreta, 45);
	carrinho.adicionaProduto(apontador, 34);
	carrinho.adicionaProduto(lapiseira, 5);

	Assert.assertEquals(true, canetaPreta.equals(canetaAzul));

    }

    @Test
    public void testeProdutoDiferentes() {

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

	Assert.assertEquals(false, canetaAzul.equals(lapiseira));

    }
}
