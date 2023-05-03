
public class Respeitoso implements FormatadorNome {

	private char genero;
	private String tratamento;
	
	public Respeitoso(char genero) {
		setGenero(genero);
		setTratamento();
	}
	
	
	private void setGenero(char genero) {
		if (genero == 'f' || genero == 'F') {
			this.genero = 'f';
		}
		else if (genero == 'm' || genero == 'M') {
			this.genero = 'm';
		}
		else {
			this.genero = 's';
		}
	}
	
	
	private void setTratamento() {
		if (this.genero == 'f') {
			this.tratamento = "Sra.";
		}
		else if (this.genero == 'm') {
			this.tratamento = "Sr.";
		}
		else {
			this.tratamento = "Sr./Sra.";
		}
	}
	

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return tratamento + " " + nome + " " + sobrenome;
	}

}
