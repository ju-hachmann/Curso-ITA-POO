
public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Gato.totalGatos);
		
		Gato gatoA = new Gato();
		
		System.out.println(Gato.totalGatos);
		System.out.println(gatoA.totalGatos);
		
		Gato gatoB = new Gato();
		
		System.out.println(Gato.totalGatos);

	}

}
