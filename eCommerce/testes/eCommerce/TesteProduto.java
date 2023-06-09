package eCommerce;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {

	Produto a;
	
	@Before
	public void inicializarProdutos() {
		a = new Produto("Produto A", 10, 250);
	}
	
	@Test
	public void doisCodigosIguais() {
		Produto b = new Produto("Produto B", 10, 300);
		assertTrue(a.equals(b));
		assertEquals(a.hashCode(), b.hashCode());
	}
	
	@Test
	public void doisCodigosDiferentes() {
		Produto b = new Produto("Produto B", 20, 300);
		assertFalse(a.equals(b));
		assertFalse(a.hashCode() == b.hashCode());
	}
	

}
