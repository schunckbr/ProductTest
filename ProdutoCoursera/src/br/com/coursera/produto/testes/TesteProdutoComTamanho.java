package br.com.coursera.produto.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.coursera.produto.models.CarrinhoDeCompras;
import br.com.coursera.produto.models.ProdutoComTamanho;

public class TesteProdutoComTamanho {

    @Test
    public void adicionaProdutoComTamanho() {

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	
	//tenisNike e tenisNike 2 possuem o mesmo codigo porem numeracao 36 e 37, portanto sao diferentes
	ProdutoComTamanho tenisNike = new ProdutoComTamanho("Nike Air Zoom Elite 8 ", 01, 499.00, 36);
	ProdutoComTamanho tenisNike2 = new ProdutoComTamanho("Nike Air Zoom Elite 8 ", 01, 499.00, 37);
	
	//tenisMizuno e tenisMizuno2 possuem o mesmo codigo e numeracao igual, portanto são iguais.
	ProdutoComTamanho tenisMizuno = new ProdutoComTamanho("Nike Air Zoom Elite 8 ", 02, 499.00, 36);
	ProdutoComTamanho tenisMizuno2 = new ProdutoComTamanho("Nike Air Zoom Elite 8 ", 02, 499.00, 36);

	carrinho.adicionaProduto(tenisNike, 20);
	carrinho.adicionaProduto(tenisNike2, 10);
	carrinho.adicionaProduto(tenisMizuno2, 45);
	carrinho.adicionaProduto(tenisMizuno, 5);

	Assert.assertEquals(false, tenisNike.equals(tenisNike2));
	Assert.assertEquals(true, tenisMizuno2.equals(tenisMizuno));


    }

}
