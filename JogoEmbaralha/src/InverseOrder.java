
public class InverseOrder implements Embaralhador {

	public InverseOrder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String embaralha(String palavra) {
		String reversed = "";
		if (palavra.length() > 0) {
			for (int i = palavra.length(); i > 0; i--) {
				reversed += palavra.charAt(i-1);
			}
		}
		return reversed;
	}

	@Override
	public int dificuldade() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
