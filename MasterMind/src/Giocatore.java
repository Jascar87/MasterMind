import java.util.ArrayList;

public abstract class Giocatore {
	protected String target;
	protected ArrayList <Tentativo> tentativi;
	
	public String getTarget(){
		return target;
	}
	public boolean addTentativo(String guess, int bulls, int maggots){
		if(Giudice.valida(guess)==true){
			tentativi.add(Tentativo(guess, bulls, maggots));
			return true;
		}
		else return false;
	}
	public String stringaTentativi(){
		
	}
	public void init(){
		target=genTarget();
		tentativi = new ArrayList <Tentativo> (); 
	}
	public abstract String genGuess();
	
	public abstract String genTarget();
}
