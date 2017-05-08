import jbook.util.Input;

public class Umano extends Giocatore{

	@Override
	public String genGuess() {
		String guess=Input.readString();
		return guess;
	}

	@Override
	public String genTarget() {
		String target=Input.readString();
		return target;
	}
	
}
