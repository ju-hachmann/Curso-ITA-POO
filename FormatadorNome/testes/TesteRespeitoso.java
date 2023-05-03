import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteRespeitoso {

	String nome;
	String sobrenome;
	String nomeCompleto; 
	
	@Before
	public void setNome() {
		nome = "Juliana";
		sobrenome = "Hachmann";
		nomeCompleto = nome + " " + sobrenome;
	}
	
	@Test
	public void femininoMaiusculo() {
		Respeitoso r = new Respeitoso('F');
		String tt = r.formatarNome(nome, sobrenome);
		String retorno = "Sra. " + nomeCompleto; 
		assertEquals(tt, retorno);
	}
	
	@Test
	public void femininoMinusculo() {
		Respeitoso r = new Respeitoso('f');
		String tt = r.formatarNome(nome, sobrenome);
		String retorno = "Sra. " + nomeCompleto; 
		assertEquals(tt, retorno);
	}
	
	@Test
	public void MasculinoMaiusculo() {
		Respeitoso r = new Respeitoso('M');
		String tt = r.formatarNome(nome, sobrenome);
		String retorno = "Sr. " + nomeCompleto; 
		assertEquals(tt, retorno);
	}
	
	@Test
	public void MasculinoMinusculo() {
		Respeitoso r = new Respeitoso('m');
		String tt = r.formatarNome(nome, sobrenome);
		String retorno = "Sr. " + nomeCompleto; 
		assertEquals(tt, retorno);
	}
	
	@Test
	public void generoForaDoPadrao() {
		Respeitoso r = new Respeitoso(' ');
		String tt = r.formatarNome(nome, sobrenome);
		String retorno = "Sr./Sra. " + nomeCompleto; 
		assertEquals(tt, retorno);
	}

}
