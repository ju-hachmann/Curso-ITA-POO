package eCommerce;

import java.util.Objects;

public class Produto {

	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(String nome, int codigo, int preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	
	
	
}
