

public class Principal {

	public static void main(String[] args) {
		
		Pizza calabresa = new Pizza();
		calabresa.adicionaIngrediente("Calabresa");
		calabresa.adicionaIngrediente("Cebola");
		calabresa.adicionaIngrediente("Manjericão");
		// Valor: R$ 20
		
		Pizza bacon = new Pizza();
		bacon.adicionaIngrediente("Bacon");
		bacon.adicionaIngrediente("Cebola");
		// Valor: R$ 15
		
		Pizza mussarela = new Pizza();
		mussarela.adicionaIngrediente("Mussarela");
		// Valor: R$ 15
		
		Pizza semsabor = new Pizza();
		// Valor: 0 (não deve ser possível adicionar)
		
		Carrinho meuCarrinho = new Carrinho();
		
		meuCarrinho.adicionaPizza(mussarela);
		meuCarrinho.adicionaPizza(bacon);
		meuCarrinho.adicionaPizza(calabresa);
		meuCarrinho.adicionaPizza(semsabor);
		
		System.out.println("Valor Calabresa: R$ " + calabresa.getPreco());
		System.out.println("Valor Bacon: R$ " + bacon.getPreco());
		System.out.println("Valor Mussarela: R$ " + mussarela.getPreco());
		System.out.println("Valor Pizza Sem Recheio: R$ " + semsabor.getPreco());
		
		System.out.println("Total de Pizzas adicionadas: " + meuCarrinho.listaPizzas.size());
		
		System.out.println(meuCarrinho.valorTotalPizzas());
		
		Pizza.imprimeIngredientes();
		
	}

}
