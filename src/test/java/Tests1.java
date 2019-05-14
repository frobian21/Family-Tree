import static org.junit.Assert.*;

import org.junit.Test;

public class Tests1 {
	@Test
	public void createFamilyclass() {
		Family fam = new Family();
	}
	@Test
	public void createsetParentOf() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
	}
	@Test
	public void onlytwoparents() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		assertFalse(fam.setParentOf("Vera", "V"));
	}
	@Test
	public void createfemale() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.female("Vanessa");
	}
	@Test
	public void createmale() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.male("George");
	}
	@Test
	public void createfemaleandmale() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.female("Vanessa");
	}
	@Test
	public void createfemaleandmaleconflict() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.female("Vanessa");
		assertFalse(fam.female("George"));
	}
	@Test
	public void createfemaleconflict() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		assertFalse(fam.isFemale("George"));
	}
	@Test
	public void createmaleconflict() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		assertFalse(fam.isMale("George"));
	}
	@Test
	public void querynewismale() {
		Family fam = new Family();
		assertFalse(fam.isMale("George"));
	}
	@Test
	public void querynewisfemale() {
		Family fam = new Family();
		assertFalse(fam.isFemale("George"));
	}
	@Test
	public void ismaledecuction() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.female("Vanessa");
		assertFalse(fam.female("George")); // false, because:
		assertTrue(fam.isMale("George")); // ...this is true.
	}
	@Test
	public void isfemaledecuction() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.male("Vanessa");
		assertFalse(fam.male("George")); // false, because:
		assertTrue(fam.isFemale("George")); // ...this is true.
	}
	@Test
	public void antiancestor() {
		fam = new Family();
		fam.setParentOf("Vera", "George");
		assertFalse(fam.setParentOf("George", "Vera"); // false
	}
	@Test
	public void creategetChildren() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		assertArrayEquals(fam.getChildren("George"),["Vera"]);
	}
	@Test
	public void creategetParents() {
		Family fam = new Family();
		fam.setParentOf("Vera", "George");
		assertArrayEquals(fam.getParents("Vera"),["George"]);
	}
	@Test
	public void querynewgetChildren() {
		Family fam = new Family();
		assertArrayEquals(fam.getChildren("George"),[]);
	}
	@Test
	public void querynewgetParents() {
		Family fam = new Family();
		assertArrayEquals(fam.getParents("George"),[]);
	}
	
}
