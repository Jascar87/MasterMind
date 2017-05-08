
public class Computer extends Giocatore{

	@Override
	public String genGuess() {
		return genTarget();
	}

	@Override
	public String genTarget() {
		String target = "";
		for (int i=0; i<Giudice.LUNGHEZZA; i++) {
            char c;
            do {
                c = Giudice.CHARS[(int)(Math.random()*Giudice.CHARS.length)];
            } while (target.indexOf(c) >= 0);
            target += c;
		}
		return target;
	}

}
