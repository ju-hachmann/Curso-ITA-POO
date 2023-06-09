package eCommerce;

import java.util.Objects;

public class ProdutoComTamanho extends Produto {

	private int tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, int preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tamanho);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		return tamanho == other.tamanho;
	}

	
	
}
