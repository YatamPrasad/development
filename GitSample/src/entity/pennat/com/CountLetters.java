package entity.pennat.com;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

	public static void main(String[] args) {
	String str ="Pennat Technaologies";
	char [] ch = str.toCharArray();
   
	Map<Character, Integer> mp = new HashMap<>();
	
	for (char c : ch) {
		if(mp.containsKey(c)) {
			mp.put(c, mp.get(c)+1);
		}else {
			mp.put(c, 1);
		}
		
	}
	for (Map.Entry<Character, Integer> m: mp.entrySet()) {
		
		System.out.println(m.getKey()+" = "+m.getValue());
		
	}
	}

}
