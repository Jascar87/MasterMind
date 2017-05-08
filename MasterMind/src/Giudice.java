
public class Giudice {
	final static int LUNGHEZZA = 4;
	final static char [] CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	public String target = new String(genTarget());
	
	public static String genTarget() {
		String target = "";
		for (int i=0; i<LUNGHEZZA; i++) {
            char c;
            do {
                c = CHARS[(int)(Math.random()*CHARS.length)];
            } while (target.indexOf(c) >= 0);
            target += c;
		}
		return target;
	}

	
	public static boolean valida(String string) {
		int stop = 0;
		if (string==null) return false;
		if (string.length()!=LUNGHEZZA) return false;
		for(char cifra: string.toCharArray()){
			control:
				for (char controllo: CHARS){
				stop =1;
					if (cifra==controllo) {
						stop = 0;
						break control; 
					}
				}
			if (stop==1) return false;
		}
		
		return true;
		
	}

	public static int numBulls(String string, String string2) {
		int bulls=0;
		for(int i=0; i<LUNGHEZZA; i++){
				if(string.toCharArray()[i]==string2.toCharArray()[i]) bulls++;
		}
		return bulls;
	}

	public static int numMaggots(String string, String string2) {
		int maggots=0;
		for(int i=0; i<LUNGHEZZA; i++){
			for(int j=0; j<LUNGHEZZA; j++){
				if(i==j) {
					if(i==LUNGHEZZA-1) return maggots;
					j++;
				}
				if (string.toCharArray()[i]==string2.toCharArray()[j]) maggots++;
			}
		}
		return maggots;
	}

}
