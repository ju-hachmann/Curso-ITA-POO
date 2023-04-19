import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void compraAVista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.getValorParcelas());
		assertEquals(500, c.getValorTotal());
	}
	
	@Test
	public void compraParcelada() {
		Compra c = new Compra(5, 200);
		assertEquals(5, c.getNumeroParcelas());
		assertEquals(200, c.getValorParcelas());
		assertEquals(1000, c.getValorTotal());
	}

}
