
public class Autoridade {

	private String nome;
	private String sobrenome;
	private FormatadorNome tratamento;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome tratamento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tratamento = tratamento;
	}
	
	public void getTratamento() {
		tratamento.formatarNome();
	}
	
}
