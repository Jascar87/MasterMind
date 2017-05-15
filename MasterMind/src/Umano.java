import jbook.util.Input;

public class Umano extends Giocatore{

	public Umano(){
		init();
	}
	
	@Override
	public String genGuess() {
		String guess = "";
		while(!Giudice.valida(guess)) guess=Input.readString();
		return guess;
	}

	@Override
	public String genTarget() {
		String target=Input.readString();
		return target;
	}
	
}
