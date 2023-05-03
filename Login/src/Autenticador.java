
public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException {
		if (login.equals("juliana") && senha.equals("000")) {
			return new Usuario(login);
		}
		throw new LoginException("Usuário e Senha não batem", login);
	}
	
}
