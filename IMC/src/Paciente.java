
public class Paciente {

	double peso;
	double altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC() {
		return (peso / (altura * altura));
	}
	
	public String diagnostico() {
		double imc = calcularIMC();
		String resultado = "";
		
		if (imc < 18.5) {
			if (imc < 16) {
				resultado = "Baixo Peso Muito Grave";
			}
			else if (imc < 16.99) {
				resultado = "Baixo Peso Grave";
			}
			else 
			resultado = "Baixo Peso";
		}
		
		else if (imc > 24.99) {
			if (imc < 29.99) {
				resultado = "Sobrepeso";
			}
			else if (imc < 34.99) {
				resultado = "Obesidade Grau I";
			}
			else if (imc < 39.99) {
				resultado = "Obesidade Grau II";
			}
			else resultado = "Obesidade Grau III (obesidade mórbida)";
		}	
		
		else {
			resultado = "Peso Normal";
		}
		
		System.out.println(resultado);
		return resultado;
	}	
	
}
