
public class Principal {

	public static void main(String[] args) {
	
		Aluno jorge = new Aluno();
		jorge.bim1 = 70;
		jorge.bim2 = 60;
		jorge.bim3 = 80;
		jorge.bim4 = 70;

		System.out.println(jorge.media());
		System.out.println(jorge.passou());
		
	}

}
