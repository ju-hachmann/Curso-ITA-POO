
public class LoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String login;
	
	public LoginException(String message, String login) {
		super(message);
		this.login = login;
		// TODO Auto-generated constructor stub
	}
	
	public String getLogin() {
		return login;
	}

	
}
