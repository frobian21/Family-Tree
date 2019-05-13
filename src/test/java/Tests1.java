import static org.junit.Assert.*;

import org.junit.Test;

public class Tests1 {
	@Test
	public void createFamilyclass() {
		const fam = new Family();
	}
	@Test
	public void createsetParentOf() {
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
	}
	@Test
	public void createfemale() {
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.female("Vanessa");
	}
	@Test
	public void createmale() {
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.male("George");
	}
	@Test
	public void createfemaleandmale() {
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.female("Vanessa");
	}
	@Test
	public void createfemaleandmaleconflict() {
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.female("Vanessa");
		assertFalse(fam.female("George"));
	}
	@Test
	public void createfemaleconflict() {
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		assertFalse(fam.isFemale("George"));
	}
	@Test
	public void createmaleconflict() {
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		assertFalse(fam.isMale("George"));
	}
	@Test
	public void querynewismale() {
		const fam = new Family();
		assertFalse(fam.isMale("George"));
	}
	@Test
	public void querynewisfemale() {
		const fam = new Family();
		assertFalse(fam.isFemale("George"));
	}
	@Test
	public void ismaledecuction() {
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		fam.setParentOf("Vera", "Vanessa");
		fam.female("Vanessa");
		assertFalse(fam.female("George")); // false, because:
		assertTrue(fam.isMale("George")); // ...this is true.
	}
	@Test
	public void isfemaledecuction() {
		const fam = new Family();
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
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		assertArrayEquals(fam.getChildren("George"),["Vera"]);
	}
	@Test
	public void creategetParents() {
		const fam = new Family();
		fam.setParentOf("Vera", "George");
		assertArrayEquals(fam.getParents("Vera"),["George"]);
	}
	@Test
	public void querynewgetChildren() {
		const fam = new Family();
		assertArrayEquals(fam.getChildren("George"),[]);
	}
	@Test
	public void querynewgetParents() {
		const fam = new Family();
		assertArrayEquals(fam.getParents("George"),[]);
	}
	
}
