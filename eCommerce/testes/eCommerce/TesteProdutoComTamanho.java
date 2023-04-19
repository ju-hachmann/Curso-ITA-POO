package eCommerce;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	ProdutoComTamanho a;
	
	@Before
	public void inicializarProdutos() {
		a = new ProdutoComTamanho("Produto A", 10, 250, 40);
	}
	
	@Test
	public void codigosIguaisTamanhosIguais() {
		ProdutoComTamanho b = new ProdutoComTamanho("Produto B", 10, 250, 40);
		assertTrue(a.equals(b));
		assertEquals(a.hashCode(), b.hashCode());
	}
	
	@Test
	public void codigosIguaisTamanhosDiferentes() {
		ProdutoComTamanho b = new ProdutoComTamanho("Produto B", 10, 250, 41);
		assertFalse(a.equals(b));
		assertFalse(a.hashCode() == b.hashCode());
	}
	
	@Test
	public void codigosDiferentesTamanhosIguais() {
		ProdutoComTamanho b = new ProdutoComTamanho("Produto B", 15, 250, 40);
		assertFalse(a.equals(b));
		assertFalse(a.hashCode() == b.hashCode());
	}

	@Test
	public void codigosDiferentesTamanhosDiferentes() {
		ProdutoComTamanho b = new ProdutoComTamanho("Produto B", 15, 250, 42);
		assertFalse(a.equals(b));
		assertFalse(a.hashCode() == b.hashCode());
	}
	

}
