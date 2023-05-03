import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteAutenticador {

	String loginCorreto;
	String loginIncorreto;
	String senhaCorreta;
	String senhaIncorreta;
	
	@Before
	public void setLogin() {
		loginCorreto = "juliana";
		loginIncorreto = "juliane";
		senhaCorreta = "000";
		senhaIncorreta = "111";
	}
	
	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar(loginCorreto, senhaCorreta);
		assertEquals(loginCorreto, u.getLogin());
	}
	
	@Test(expected=LoginException.class)
	public void loginComFalha() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar(loginCorreto, senhaIncorreta);
	}
	
	@Test
	public void informacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar(loginCorreto, senhaIncorreta);
			fail();
		} catch (LoginException e) {
			assertEquals(e.getLogin(), loginCorreto);
			
		}
	}
	 

}
