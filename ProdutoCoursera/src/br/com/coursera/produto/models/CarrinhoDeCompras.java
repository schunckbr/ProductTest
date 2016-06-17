package br.com.coursera.produto.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*Classe CarrinhoDeCompras
* @Author: Marcelo Schunck
* Crie uma classe CarrinhoDeCompras que armazene em um atributo interno do tipo HashMap 
* cada produto adicionado no carrinho e sua respectiva quantidade. O método adicionaProduto() 
* deve receber a instancia do produto e a quantidade. Caso o produto já exista no HashMap, a 
* quantidade deve ser somada a que já existe no carrinho. Deve haver também um método 
* removeProduto() que também recebe a instancia do produto e a quantidade a ser removida. 
* Observe que produtos de tamanhos diferentes devem ser considerados como produtos diferentes 
* no carrinho. O carrinho deve possuir um método que calcula o valor total da compra.
*/
public class CarrinhoDeCompras {

    protected int qtd;

    protected double valorTotalDoCarrinho;

    protected Map<Produto, Integer> produtos = new HashMap<Produto, Integer>();

    public void adicionaProduto(Produto produto, int qtd) {
	if (produtos.containsKey(produto)) {
	    int quantidade = produtos.get(produto);
	    produtos.put(produto, qtd + quantidade);
	} else {
	    produtos.put(produto, qtd);
	}
    }

    public void listaProdutos() {
	for (Entry<Produto, Integer> produtos : produtos.entrySet()) {
//	    String produto = produtos.getKey().getNome();
//	    int codigo = produtos.getKey().getCodigo();
	    Integer qtd = produtos.getValue();
//	    double preco = produtos.getKey().getPreco();
	    System.out.println(produtos.getKey());
	    System.out.println("=======================");
	}
    }

    public double getValorTotalDoCarrinho() {

	for (Entry<Produto, Integer> produtos : produtos.entrySet()) {
	    Integer qtd = produtos.getValue();
	    double preco = produtos.getKey().getPreco();
	    valorTotalDoCarrinho += qtd * preco;
	}

	return valorTotalDoCarrinho;
    }

    public int getQtd() {
	for (Entry<Produto, Integer> produtos : produtos.entrySet()) {
	    Integer qtd = produtos.getValue();
	    this.qtd = qtd;
	}
	return qtd;
    }

    public void removeProduto(Produto produto, int qtd) {
	if (produtos.containsKey(produto)) {
	    produtos.remove(produto);
	}
    }

    public Map<Produto, Integer> getProdutos() {
	return produtos;
    }

}
