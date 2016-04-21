import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AllergenTest {
	@Test 
	public void Allergen_shouldReturnItemizationOFAllergiesBasedOnScore_StringArrayList() {
		Allergen testAllergen = new Allergen();
		ArrayList<String> actual = testAllergen.listAllergies(3);
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("peanuts");
		expected.add("eggs");
		assertEquals(expected, actual);
	}

	@Test
	public void Allergen_shouldReturnProperValuesForMoreComplexInput_StringArrayList() {
		Allergen testAllergen = new Allergen();
		ArrayList<String> actual = testAllergen.listAllergies(195);
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("cats");
		expected.add("pollen");
		expected.add("peanuts");
		expected.add("eggs");
		assertEquals(expected, actual);
	}
}