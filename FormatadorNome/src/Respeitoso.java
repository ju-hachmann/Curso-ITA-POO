
public class Respeitoso implements FormatadorNome {

	private char genero;
	private String nome;
	private String sobrenome;
	
	
	public Respeitoso(char genero, String nome, String sobrenome) {
		if (genero == 'f' || genero == 'm') {
			this.genero = genero;			
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
	}


	@Override
	public String formatarNome(String nome, String sobrenome) {
		String tratamento = "Sr./Sra.";
		if (this.genero == 'f') {
			tratamento = "Sra.";
		}
		else if (this.genero == 'm') {
			tratamento = "Sr.";
		}
		return tratamento + " " + nome + " " + sobrenome;
	}

}
