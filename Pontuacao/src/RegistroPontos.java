
public class RegistroPontos {
	
	private CalculadoraBonus bonus;
	
	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;
	}

	public void fazerUmComentario(Usuario user) {
		user.pontos += 3 * bonus.bonus(user);
	}
	
	public void criarUmTopico(Usuario user) {
		user.pontos += 5 * bonus.bonus(user);
	}
	
	public void darUmLike(Usuario user) {
		user.pontos += 1 * bonus.bonus(user);
	}
	
}
