package classesTV;

public class TV {

	private int canal;
	private final int canalMax = 10;
	private String modelo;
	private int volume;
	private ConexaoTv verificarSinal;

	public TV(int canal, String modelo, int volume) {

		this.canal = canal;
		this.modelo = modelo;
		this.volume = volume;
		this.verificarSinal = new ConexaoTv(false);

	}

	public void setSinal(int sinal) {
		if (sinal == 1) {
			this.verificarSinal.ativarSinal();
		} else {
			this.verificarSinal.desativarSinal();
		}
	}

	public void mudarCanal(String controle) {

		if (controle.equals("+")) {
			this.canal++;
			if (this.canal > this.canalMax) {
				this.canal = 0;
			}
		} else {
			this.canal--;
			if (this.canal < 0) {
				this.canal = this.canalMax;
			}
		}

	}

	public void alterarVolume(String volume) {
		final int volMax = 10;
		if (volume.equals("+")) {
			this.volume++;
			if (this.volume > volMax) {
				this.volume = volMax;
			}
		} else {
			this.volume--;
			if (this.volume < 0) {
				this.volume = 0;
			}
		}
	}

	public String statusAtual() {

		if (this.verificarSinal.sinalAtual() == true) {
			return "Volume: " + this.volume + " Canal: " + this.canal + "(CANAL ATIVO) Modelo: " + this.modelo;
		} else {

			return "Volume: " + this.volume + " Canal: " + this.canal + "(SEM SINAL)  Modelo: " + this.modelo;
		}
	}

}
