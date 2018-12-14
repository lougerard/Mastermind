/**
 * 
 */
package mastermind;

import java.util.Random;

/**
 * @author USER1
 *
 */
public class GameControllerGUI {
	
	public char[] combiIn = new char[4]; 
	
	
	Correction instCorr = new Correction();
	RandomCombi instCombiRandom = new RandomCombi();

	public GameControllerGUI() {
			
	}
	
	
	public String corrige(String txt) {
		
		char tab[] = new char[4];
		
		
		for(int i=0;i < 4;i++) {
			tab[i] = txt.charAt(i);
		}
		
		char correct[] = new char[4];
		correct = instCorr.correction(tab,instCombiRandom.combi);
		
		txt ="";
		for(int i=0;i < 4;i++) {
			txt += correct[i];
		}
		
		
		
		return txt;	
	}
	
	
	public boolean ifCorrect(String combi) {
		
		String test = "";
		for(int i = 0; i<4;i++) {
			test+=instCombiRandom.combi[i];
		}
		
		if(combi.equals(test)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int levelSolo(String txt) {
		
		char lettre = txt.charAt(0);
		int lvl = 0;
		
		if(lettre == 'H' || lettre == 'h') {
			lvl= 5;
		}
		else if(lettre == 'N' || lettre == 'n') {
			lvl= 9; 
		}
		else if(lettre == 'E' || lettre == 'e') {
			lvl= 12; 
		}
		else {
			System.out.print("Level incorrect");
		}
		return lvl;
		
	}
	
	public String convertWithoutSpaces(String txt) {
		String txt2 = "";
		int i = 0;
		while (i <= 6) {
			txt2+= txt.charAt(i);
			i=i+2;
		}
		return txt2;
		
		
	}
	
	
	
	public String newCombiPc(char positionCorrect[],char numeroCorrect[]){
		
		char[] combiPc = new char[4];
		String retour = "";				
		
		Random r = new Random();
		int size = instCombiRandom.combiRandom.length();
		
		
		for (int i = 0; i < 4; i++) {
			combiPc[i] = instCombiRandom.combiRandom.charAt(r.nextInt(size)); // transformer le String en tableau
			
			if(positionCorrect[i] == 't') {
				combiPc[i] = numeroCorrect[i];
			}
		}
		
		for(int i=0;i < 4;i++) {
			retour += combiPc[i];
		}
		
		
		
		return retour;
		
		
	}
	
	
	
	public char[][] corrigePc(char positionCorrect[],char numeroCorrect[],String combiPc,String combiUti) {
		
		char correctPc[] = new char[4];
		char correctUti[] = new char[4];

		char combiUti2[] = new char[4];
		char combiPc2[] = new char[4];
		char retour[][]= new char[3][4];
		
	
		
		
		for(int i=0;i < 4;i++) {
			combiUti2[i] = combiUti.charAt(i);
			combiPc2[i] = combiPc.charAt(i);
		}
		
		correctPc = instCorr.correction(combiPc2,instCombiRandom.combi);
		correctUti = instCorr.correction(combiUti2,instCombiRandom.combi);
		
		
		for(int i = 0; i < 4; i++) {
			if(correctPc[i] == 'V'){
				positionCorrect[i] = 't';
				numeroCorrect[i] = combiPc2[i];
			}
			if(correctUti[i] == 'V'){
				positionCorrect[i] = 't';
				numeroCorrect[i] = combiUti2[i];
			}
			
				
		}
	
	
		retour[0] = positionCorrect;
		retour[1] = numeroCorrect;
		retour[2] = correctPc;
		
		return retour;
		
	}
	
	
	
}
