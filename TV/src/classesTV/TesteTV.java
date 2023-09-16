package classesTV;

public class TesteTV {

	public static void main(String[] args) {
		
		TV tv = new TV(5, "botas", 3);
		
		System.out.println(tv.statusAtual());
		
		tv.setSinal(1);
		tv.mudarCanal("+");
		tv.mudarCanal("+");
		tv.mudarCanal("+");
		
		System.out.println(tv.statusAtual());
		
		tv.alterarVolume("-");
		tv.alterarVolume("-");
		System.out.println(tv.statusAtual());
		tv.alterarVolume("+");
		tv.alterarVolume("-");
		
		System.out.println(tv.statusAtual());
		
	}

}
