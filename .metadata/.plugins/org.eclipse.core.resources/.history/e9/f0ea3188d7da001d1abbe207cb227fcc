
public class Compra {
	
	int valorTotal;
	int numeroParcelas;
	
	// a vista
	public Compra(int valor) {
		valorTotal = valor;
		numeroParcelas = 1;
	}
	
	// parcelado
	public Compra(int qtdParcelas, int valorParcela) {
		valorTotal = valorParcela * qtdParcelas;
		numeroParcelas = qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	
	public int getValorParcelas() {
		return valorTotal / numeroParcelas;
	}
	
	
}
