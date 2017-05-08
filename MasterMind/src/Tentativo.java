
public class Tentativo {
	private final String guess;
	private final int bulls;
	private final int maggots;
	
	public Tentativo(String guess, int bulls, int maggots ){
		this.guess=guess;
		this.bulls=bulls;
		this.maggots=maggots;
	}

	public String getGuess() {
		return guess;
	}

	public int getBulls() {
		return bulls;
	}

	
	public int getMaggots() {
		return maggots;
	}
	
}
