import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteComTitulo {

	
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
	public void ComTitulo() {
		String titulo = "Esplêndida";
		ComTitulo ct = new ComTitulo(titulo);
		String tt = ct.formatarNome(nome, sobrenome);
		String retorno = titulo + " " + nomeCompleto;
		assertEquals(retorno, tt);
	}

}
