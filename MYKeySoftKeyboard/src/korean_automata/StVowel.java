package korean_automata;

import java.util.*;

/**
 * Calculate alone vowel.
 * @author sunghoonpark
 *
 */
public class StVowel extends CombinationState {
	
	public StVowel(){
		repeat = false;
	}

	@Override
	public int[] combine(ArrayList<Integer> phoArr, KoreanAutomata ka) {
		ka.setIsFinalInput(false);
		
		combPhon = new int[1];
		
		combPhon[0] = calcPhoneme(phoArr.get(0));
		
		ka.setEnter(true);
		return combPhon;
	}

}
