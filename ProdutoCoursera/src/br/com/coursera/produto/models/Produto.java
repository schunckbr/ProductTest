package br.com.coursera.produto.models;

/*Classe Produto
* @Author: Marcelo Schunck
* Crie uma classe chamada Produto que deve possuir um nome, 
* um código e um preço. Sobrescreva os métodos equals() e hashCode() 
* de Object (veja seção sobre esses métodos), de forma a serem considerados 
* iguais instancias de Produto que possuam o mesmo código.
*/

public class Produto {

	protected String nome;
	protected int codigo;
	protected double preco;

	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String toString(){
	    return "PRODUTO : " + this.getNome() + "\n" + "CODIGO : " + this.getCodigo() + "\n" + "VALOR :" + this.getPreco();
	    
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}



}
