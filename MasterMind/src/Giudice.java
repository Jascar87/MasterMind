
public class Giudice {
	final static int LUNGHEZZA = 4;
	final static char [] CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	public void genTarget(){
		
	}
	
	public static boolean valida(String string) {
		int stop = 0;
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

}
