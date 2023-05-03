import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRandom {

	@Test
	public void randomNulo() {
		Embaralhador random = new RandomOrder();
		String randomized = random.embaralha("");
		assertEquals(randomized, "");
	}
	
	@Test
	public void randomUmaLetra() {
		Embaralhador random = new RandomOrder();
		String randomized = random.embaralha("a");
		assertEquals(randomized, "a");
	}
	
	@Test
	public void randomVariasLetras() {
		Embaralhador random = new RandomOrder();
		String palavra = "ana";
		//String randomized = random.embaralha(palavra);
		String randomized = "ann";
		String charList = randomized;
		System.out.println(randomized);
		boolean todasAsLetras = true;
		for (int i = 0; i < palavra.length(); i++) {
			if (charList.contains(String.valueOf(palavra.charAt(i)))) {
				charList
				break;
			}
		}
		assertTrue(todasAsLetras);
		assertEquals(randomized.length(), palavra.length());
		assertFalse(randomized.equals(palavra));		
	}

}
