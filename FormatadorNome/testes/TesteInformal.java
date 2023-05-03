import static org.junit.Assert.*;

import org.junit.Test;

public class TesteInformal {

	@Test
	public void Informal() {
		Informal i = new Informal();
		String tt = i.formatarNome("Juliana", "Hachmann");
		assertEquals(tt, "Juliana");
	}

}
