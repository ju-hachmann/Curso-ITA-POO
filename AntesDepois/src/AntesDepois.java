import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class AntesDepois {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass");
	}

	
	@Before
	public void before() {
		System.out.println("@Before");
	}
	
	@After
	public void after() {
		System.out.println("@After");
	}
	
	@Test
	public void teste1() {
		System.out.println("Teste 1");
	}

	@Test
	public void teste2() {
		System.out.println("Teste 2");
	}

	@Test
	public void teste3() {
		System.out.println("Teste 3");
	}

}
