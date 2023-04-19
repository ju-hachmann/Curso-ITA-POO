import java.util.ArrayList;
import java.util.HashMap;


public class Pizza {

	public static HashMap<String, Integer> totalIngredientes = new HashMap<String, Integer>();
	
	public ArrayList<String> ingredientes = new ArrayList<String>();
	
	public static void esvaziaIngrediente() {
		totalIngredientes.clear();
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
		int totalIngrediente = 1;
		if (totalIngredientes.containsKey(ingrediente)) {
			totalIngrediente = totalIngredientes.get(ingrediente);
			totalIngrediente++;
		}
		totalIngredientes.put(ingrediente, totalIngrediente);
	}
	
	
	public void adicionaIngrediente(String ingrediente) {
		if (ingredienteDuplicado(ingrediente)) {
			System.out.println("Você já adicionou " + ingrediente + "!");
		}
		else {
			ingredientes.add(ingrediente);
			contabilizaIngrediente(ingrediente);			
		}
	}
	
	boolean ingredienteDuplicado(String ingrediente) {
		if (ingredientes.contains(ingrediente)) {
			return true;
		}
		return false;
	}
	
	
	public int getPreco() {
		
		int numeroIngredientes = ingredientes.size();
		int preco = 0;
		
		if (numeroIngredientes > 0) {
			if (numeroIngredientes < 3) 
				preco = 15;
			else if (numeroIngredientes < 5) 
				preco = 20;
			else 
				preco = 23;
		}
		return preco;
	}
	
	public static void imprimeIngredientes() {
		System.out.println("Total de Ingredientes consumidos na Pizzaria:\n");
		for(String ing : totalIngredientes.keySet()) {
			System.out.println(ing + " = " + totalIngredientes.get(ing));
		}
	}
	
	
}
