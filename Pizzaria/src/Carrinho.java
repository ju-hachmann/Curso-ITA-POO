import java.util.ArrayList;

public class Carrinho {

	public ArrayList<Pizza> listaPizzas = new ArrayList<Pizza>();
	
	public void adicionaPizza(Pizza pizza) {
		if (pizza.ingredientes.size() > 0) {
			listaPizzas.add(pizza);
		}
		else System.out.println("Não é possível adicionar pizzas sem ingredientes no carrinho");
	}
	
	public int valorTotalPizzas() {
		int totalPizzas = 0;
		for(Pizza p : listaPizzas) {
			totalPizzas += p.getPreco();
		}
		return totalPizzas;
	}
	
	
}
