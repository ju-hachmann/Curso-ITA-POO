import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		Usuario user = new Usuario();
		user.nome = "Juliana";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(user);
		assertEquals(5, user.pontos);
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		Usuario user = new Usuario();
		user.nome = "Juliana";
		user.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(user);
		assertEquals(25, user.pontos);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario user = new Usuario();
		user.nome = "Juliana";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(user);
		assertEquals(15, user.pontos);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDiaVIP() {
		Usuario user = new Usuario();
		user.nome = "Juliana";
		user.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(user);
		assertEquals(50, user.pontos);
	}
	
	
	@Test
	public void pontosDarLike() {
		Usuario user = new Usuario();
		user.nome = "Juliana";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.darUmLike(user);
		assertEquals(1, user.pontos);
	}
	
	@Test
	public void pontosDarLikeVIP() {
		Usuario user = new Usuario();
		user.nome = "Juliana";
		user.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.darUmLike(user);
		assertEquals(5, user.pontos);
	}
	
	@Test
	public void pontosDarLikeBonusDoDia() {
		Usuario user = new Usuario();
		user.nome = "Juliana";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.darUmLike(user);
		assertEquals(3, user.pontos);
	}
	
	@Test
	public void pontosDarLikeBonusDoDiaVIP() {
		Usuario user = new Usuario();
		user.nome = "Juliana";
		user.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.darUmLike(user);
		assertEquals(10, user.pontos);
	}
	

}
