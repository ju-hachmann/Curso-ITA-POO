
public class Principal {

	public static void main(String[] args) {
		
		Pilha p = new Pilha(10);
		
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("José");
		
		System.out.println(p.topo());
		System.out.println(p.getTamanho());
		
		p.setTopo(6);
		
		// Desempilhando
		System.out.println("\nDesempilhando");
		p.desempilhar();
		System.out.println(p.topo());
		System.out.println(p.getTamanho());
		

	}

}
