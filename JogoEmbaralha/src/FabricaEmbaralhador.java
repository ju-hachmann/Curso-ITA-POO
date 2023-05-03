import java.util.ArrayList;


public class FabricaEmbaralhador {

	private ArrayList<Embaralhador> embaralhadores = new ArrayList<Embaralhador>();
	
	public FabricaEmbaralhador() {
		embaralhadores.add(new InverseOrder());
		embaralhadores.add(new RandomOrder());
		embaralhadores.add(new SwitchPairOrder());
	}
	
	// Só quero que cada vez crie uma instância e retorne um embaralhador diferente
	
	public Embaralhador criaEmbaralhador() {
		// escolhe random
		return embaralhadores.get(0);
	}
	
	
	
}
