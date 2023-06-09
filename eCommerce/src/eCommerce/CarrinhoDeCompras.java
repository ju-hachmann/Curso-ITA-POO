package eCommerce;

import java.util.HashMap;
import java.util.Map;


public class CarrinhoDeCompras {

	
	private Map<Produto, Integer> produtos = new HashMap<>();
	
	
	public void adicionaProduto(Produto p, Integer quantidade) {
		if (produtos.containsKey(p)) {
			quantidade += produtos.get(p);
		}
		produtos.put(p, quantidade);
	}
	
	
	public int removeProduto(Produto p) {
		if (produtos.containsKey(p)) {
			produtos.remove(p);
			return 0;
		}
		return 1;
	}
	
	
	public int getValorCarrinho() {
		int valorTotal = 0;
		for (Produto p : produtos.keySet()) {
			valorTotal += p.getPreco() * produtos.get(p);
		}
		return valorTotal;
	}
	
	
	public int getSizeCarrinho() {
		return produtos.size();
	}
	
	
	public void imprimeCarrinho() {
		for (Produto p : produtos.keySet()) {
			System.out.println(p.getNome() + ", Cod. " + p.getCodigo() + ": " + produtos.get(p));
		}
	}

}
