package br.com.coursera.produto.models;

/*Classe ProdutoComTamanho
* @Author: Marcelo Schunck
* Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto. 
* Essa classe deve possuir uma informação adicional de tamanho. Um exemplo 
* seria o tamanho de uma roupa ou a numeração de um calçado. Método equals() 
* e hashCode() devem ser sobrescritos de forma que um produto com mesmo código 
* e tamanhos diferentes são considerados diferentes.
*/

public class ProdutoComTamanho extends Produto {
	
	public int tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}	

	 public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = super.hashCode();
	    result = prime * result + tamanho;
	    return result;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
		return true;
	    if (!super.equals(obj))
		return false;
	    if (!(obj instanceof ProdutoComTamanho))
		return false;
	    ProdutoComTamanho other = (ProdutoComTamanho) obj;
	    if (tamanho != other.tamanho)
		return false;
	    return true;
	}



}
