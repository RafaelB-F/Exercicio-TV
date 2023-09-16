package classesTV;

public class ConexaoTv {

	private boolean sinal;
	
	
	public ConexaoTv(boolean sinal) {
		this.sinal = sinal;
	}

	public void ativarSinal(){
		sinal = true;
	}

	public void desativarSinal(){
		sinal = false;
	}
	
	public boolean sinalAtual() {
		return this.sinal;
	}
	
}
