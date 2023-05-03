import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteAutoridade {

	String nome;
	String sobrenome;
	String nomeCompleto; 
	
	@Before
	public void setNome() {
		nome = "Paulo";
		sobrenome = "Andres";
		nomeCompleto = nome + " " + sobrenome;
	}
	
	@Test
	public void autoridadeInformal() {
		Autoridade aut = new Autoridade(nome, sobrenome, new Informal());
		String tt = aut.getTratamento();
		System.out.println(tt);
		String retorno = nome;
		assertEquals(tt, retorno);
	}
	
	@Test
	public void autoridadeRespeitoso() {
		Autoridade aut = new Autoridade(nome, sobrenome, new Respeitoso('m'));
		String tt = aut.getTratamento();
		System.out.println(tt);
		String retorno = "Sr. " + nomeCompleto;
		assertEquals(tt, retorno);
	}
	
	@Test
	public void autoridadeComTitulo() {
		String titulo = "Magnifico";
		Autoridade aut = new Autoridade(nome, sobrenome, new ComTitulo(titulo));
		String tt = aut.getTratamento();
		System.out.println(tt);
		String retorno = titulo + " " + nomeCompleto;
		assertEquals(tt, retorno);
	}
	

}
