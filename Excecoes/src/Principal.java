
public class Principal {

	public static void main(String[] args) {
		a(100);
		System.out.println("Terminando a execução de main()");

	}
	
	public static void a(int i) {
		System.out.println("Executando a() com nº " + i);
		try {
			b(i);
			System.out.println("Fim do TRY");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Tratando a exceção " + e.getMessage() + " em a()");
			//e.printStackTrace();
		}
		System.out.println("Terminando execução de a()");
	}
	
	public static void b(int i) throws Exception {
		System.out.println("Executando b() com nº " + i);
		if (i > 0)
			throw new Exception("Mensagem");
		System.out.println("Terminando a execução de b()");
	}

}
