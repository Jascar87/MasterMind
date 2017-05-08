import java.util.ArrayList;

public abstract class Giocatore {
	protected String target;
	protected ArrayList <Tentativo> tentativi;
	
	public String getTarget(){
		return target;
	}
	public boolean addTentativo(String guess, int bulls, int maggots){
		if(Giudice.valida(guess)==true){
			tentativi.add(new Tentativo(guess, bulls, maggots));
			return true;
		}
		else return false;
	}
	public String stringaTentativi(){
		String string = new String();
		for(Tentativo t: tentativi){
			string.concat(t.toString());
		}
		return string;
	}
	public void init(){
		target=genTarget();
		tentativi = new ArrayList <Tentativo> (); 
	}
	public abstract String genGuess();
	
	public abstract String genTarget();
}
