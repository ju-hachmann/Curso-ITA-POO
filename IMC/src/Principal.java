
public class Principal {

	public static void main(String[] args) {
		Paciente pacienteA = new Paciente(70, 1.78);
		Paciente pacienteB = new Paciente(40, 1.66);
		Paciente pacienteC = new Paciente(130, 1.75);

		pacienteA.diagnostico();
		pacienteB.diagnostico();
		pacienteC.diagnostico();
		
	}

}
