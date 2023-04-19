import static org.junit.Assert.*;

import org.junit.Test;


public class TesteCarrinho {

	
	@Test
	public void carrinhoVazio() {
		Carrinho c = new Carrinho();
		assertEquals(0, c.listaPizzas.size());
		assertEquals(0, c.valorTotalPizzas());
	}
	
	@Test
	public void umaPizzaSemIngredientes() {
		Pizza p = new Pizza();
		Carrinho c = new Carrinho();
		c.adicionaPizza(p);
		assertEquals(0, c.listaPizzas.size());
		assertEquals(0, c.valorTotalPizzas());
	}
	
	@Test
	public void umaPizzaUmIngrediente() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		Carrinho c = new Carrinho();
		c.adicionaPizza(p);
		assertEquals(1, c.listaPizzas.size());
		assertEquals(15, c.valorTotalPizzas());
	}
	
	
	@Test
	public void umaPizzaCincoIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("mussarela");
		p.adicionaIngrediente("bacon");
		p.adicionaIngrediente("milho");
		p.adicionaIngrediente("tomate seco");
		Carrinho c = new Carrinho();
		c.adicionaPizza(p);
		assertEquals(1, c.listaPizzas.size());
		assertEquals(23, c.valorTotalPizzas());
	}
	
	
	@Test
	public void duasPizzasTrêsIngredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("calabresa");
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("bacon");
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("calabresa");
		p2.adicionaIngrediente("mussarela");
		p2.adicionaIngrediente("bacon");
		Carrinho c = new Carrinho();
		c.adicionaPizza(p1);
		c.adicionaPizza(p2);
		assertEquals(2, c.listaPizzas.size());
		assertEquals(40, c.valorTotalPizzas());
	}


}
