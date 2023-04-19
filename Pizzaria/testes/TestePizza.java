
import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;



public class TestePizza {

	
	@Before
	public void zeraListaIngredientes() {
		Pizza.esvaziaIngrediente();
	}

	
	@Test
	public void listaVazia() {
		assertEquals(0, Pizza.totalIngredientes.size());
	}
	
	
	@Test
	public void adicionaUmIngrediente() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		assertEquals(1, p.ingredientes.size());
		assertEquals(1, Pizza.totalIngredientes.size());
	}
	
	
	@Test
	public void adicionaDoisIngredientesDiferentes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("mussarela");
		assertEquals(2, p.ingredientes.size());
		assertEquals(2, Pizza.totalIngredientes.size());
	}
	
	
	@Test
	public void adicionaDoisIngredientesIguais() {
		Pizza p = new Pizza();
		String ingrediente = "calabresa";
		p.adicionaIngrediente(ingrediente);
		p.adicionaIngrediente(ingrediente);
		assertEquals(1, p.ingredientes.size());
		assertEquals(1, Pizza.totalIngredientes.size());
		// assertEquals(1, Pizza.totalIngredientes.get(ingrediente));
	}
	
	
	@Test
	public void precoZeroIngredientes() {
		Pizza p = new Pizza();
		assertEquals(0, p.ingredientes.size());
		assertEquals(0, p.getPreco());
		assertEquals(0, Pizza.totalIngredientes.size());
	}
	
	@Test
	public void precoUmIngrediente() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		assertEquals(1, p.ingredientes.size());
		assertEquals(15, p.getPreco());
		assertEquals(1, Pizza.totalIngredientes.size());
	}

	
	@Test
	public void precoDoisIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("mussarela");
		assertEquals(2, p.ingredientes.size());
		assertEquals(15, p.getPreco());
		assertEquals(2, Pizza.totalIngredientes.size());
	}
	
	@Test
	public void precoTresIngredientesDoisIguais() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("mussarela");
		assertEquals(2, p.ingredientes.size());
		assertEquals(15, p.getPreco());
		assertEquals(2, Pizza.totalIngredientes.size());
	}
	
	@Test
	public void precoTresIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("mussarela");
		p.adicionaIngrediente("bacon");
		assertEquals(3, p.ingredientes.size());
		assertEquals(20, p.getPreco());
		assertEquals(3, Pizza.totalIngredientes.size());
	}
	
	@Test
	public void precoQuatroIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("mussarela");
		p.adicionaIngrediente("bacon");
		p.adicionaIngrediente("milho");
		assertEquals(4, p.ingredientes.size());
		assertEquals(20, p.getPreco());
		assertEquals(4, Pizza.totalIngredientes.size());
	}
	
	@Test
	public void precoCincoIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("mussarela");
		p.adicionaIngrediente("bacon");
		p.adicionaIngrediente("milho");
		p.adicionaIngrediente("tomate seco");
		assertEquals(5, p.ingredientes.size());
		assertEquals(23, p.getPreco());
		assertEquals(5, Pizza.totalIngredientes.size());
	}
	
	@Test
	public void precoSeisIngredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("mussarela");
		p.adicionaIngrediente("bacon");
		p.adicionaIngrediente("milho");
		p.adicionaIngrediente("tomate seco");
		p.adicionaIngrediente("manjericão");
		assertEquals(6, p.ingredientes.size());
		assertEquals(23, p.getPreco());
		assertEquals(6, Pizza.totalIngredientes.size());
	}
	
	

}
