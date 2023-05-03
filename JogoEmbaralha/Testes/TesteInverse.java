import static org.junit.Assert.*;

import org.junit.Test;

public class TesteInverse {

	@Test
	public void inveterNulo() {
		Embaralhador inverseOrder = new InverseOrder();
		String reversed = inverseOrder.embaralha("");
		assertEquals(reversed, "");
	}
	
	@Test
	public void inveterUmaLetra() {
		Embaralhador inverseOrder = new InverseOrder();
		String reversed = inverseOrder.embaralha("j");
		assertEquals(reversed, "j");
	}
	
	@Test
	public void inveterVariasLetras() {
		Embaralhador inverseOrder = new InverseOrder();
		String reversed = inverseOrder.embaralha("juliana");
		assertEquals(reversed, "anailuj");
	}

}
