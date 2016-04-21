import java.util.ArrayList;
import java.util.HashMap;

public class Allergen {
	public static ArrayList<String> listAllergies(Integer score) {
		ArrayList<String> allergyList = new ArrayList<String>();
		HashMap<Integer, String> allergenWiki = new HashMap<Integer, String>();
		allergenWiki.put(1, "eggs");
		allergenWiki.put(2, "peanuts");
		allergenWiki.put(4, "shellfish");
		allergenWiki.put(8, "strawberries");
		allergenWiki.put(16, "tomatoes");
		allergenWiki.put(32, "chocolate");
		allergenWiki.put(64, "pollen");
		allergenWiki.put(128, "cats");

		while(score > 127) {
			String cats = allergenWiki.get(128);
			allergyList.add(cats);
			score-=128;
		}

		while(score > 63) {
			String pollen = allergenWiki.get(64);
			allergyList.add(pollen);
			score-=64;
		}

		while(score > 31) {
			String chocolate = allergenWiki.get(32);
			allergyList.add(chocolate);
			score-=32;
		}

		while(score > 15) {
			String tomatoes = allergenWiki.get(16);
			allergyList.add(tomatoes);
			score-=16;
		}

		while(score > 7) {
			String strawberries = allergenWiki.get(8);
			allergyList.add(strawberries);
			score-=8;
		}

		while(score > 3) {
			String shellfish = allergenWiki.get(4);
			allergyList.add(shellfish);
			score-=4;
		}

		while(score > 1) {
			String peanuts = allergenWiki.get(2);
			allergyList.add(peanuts);
			score-=2;
		}

		while(score > 0) {
			String eggs = allergenWiki.get(1);
			allergyList.add(eggs);
			score-=1;
		}

		return allergyList;
	}
}