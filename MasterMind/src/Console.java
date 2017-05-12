import jbook.util.Input;

public class Console {

	private static Umano umano = new Umano();
	private static Computer computer = new Computer();
	private static int guessMax, numBU, numBC;

	/**
	 * Il main fa giocare umano vs computer;
	 */
	public static void main(String[] args) {
		while (true) {
			inizializzaGioco();
			for (int numGuess = 0; numGuess < guessMax; numGuess++) {
				System.out.println("Guess n:" + (numGuess+1));
				String guessU = umano.genGuess();
				String guessC = computer.genGuess();
				System.out.println("Guess del computer:" + guessC);
				nuovoTentativo(guessU, guessC);
				stampaSituazioneTentativi();
				if ((numBU == 4) || (numBC == 4))
					break;
			}
			stampaSituazioneFinale();
		}
	}

	/**
	 * Il metodo inizializzaGioco chiede all'utente se vuole giocare,  il
	 * numero di guess massimo, e inizializza gli oggetti computer e utente.
	 */
	public static void inizializzaGioco() {
		String risposta;
		do
			risposta = Input.readString("Vuoi inziare una partita? (y/n)");
		while (!(risposta.equals("y")) && !(risposta.equals("n")));
		if (risposta.equals("n"))
			System.exit(1);
		guessMax = Input
				.readInt("Quale deve essere il numero massimo di guess:");
		while (guessMax < 1);
		umano.init();
		computer.init();
	}

	/**
	 * Il metodo aggiornaListaTentativi aggiunge il risultato del guess corrente
	 * (dell'utente e del computer) nelle loro rispettive liste di tentativi.
	 */
	public static void nuovoTentativo(String guessU, String guessC) {
		numBU = Giudice.numBulls(guessU, computer.getTarget());
		int numMU = Giudice.numMaggots(guessU, computer.getTarget());
		numBC = Giudice.numBulls(guessC, umano.getTarget());
		int numMC = Giudice.numMaggots(guessC, umano.getTarget());
		computer.addTentativo(guessC, numBC, numMC);
		umano.addTentativo(guessU, numBU, numMU);
	}

	/**
	 * Il metodo stampaSituazioneTentativi stampa le liste di tentativi
	 * dell'utente e del computer.
	 */
	public static void stampaSituazioneTentativi() {
		System.out.println("Situazione tentativi utente");
		System.out.println("****************************");
		System.out.println(umano.stringaTentativi());
		System.out.println("****************************");
		System.out.println("Situazione tentativi computer");
		System.out.println("****************************");
		System.out.println(computer.stringaTentativi());
		System.out.println("****************************");
	}

	/**
	 * Il metodo stampaSituazioneFinale stampa il risultato del gioco
	 */
	public static void stampaSituazioneFinale() {
		if (numBU != 4 && numBC != 4) {
			System.out
					.println("Raggiunto il limite massimo dei guess e nessuno ha vinto!");
			System.out.println("La combinazione del computer era: "
					+ computer.getTarget());
		}
		if (numBU == 4 && numBC != 4)
			System.out.println("Bravo hai vinto!");
		if (numBU != 4 && numBC == 4)
			System.out.println("Il computer e' stato piu' bravo di te!");
		if (numBU == 4 && numBC == 4)
			System.out.println("Avete vinto entrambi!");
	}

}