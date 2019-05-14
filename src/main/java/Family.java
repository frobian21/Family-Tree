import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Family {
	private ArrayList<Person> people = new ArrayList<Person>();

	public boolean setParentOf(String child, String parent) {
//		for(int i=1;i<=people.length;i++)
		Stream<Person> stream1 = people.stream();
		stream1.map(x->x.getName())
		.filter(name->child.equals(name))
		.collect(Collectors.toList());
		.forEach();
		// check children list for the name, if it is there add the parent to the parent
		// array, else create person for child.
		// do the same for parent.
		return true;
	}

}

class Person {
	private String name;
	private Person Parents[] = new Person[1];
	int numberofparents=0;
	private ArrayList<Person> Children;

	public void setName(String name) {
		this.name =name;
	}

	public void setParents(Person Parent) {
		Parents[0]=Parent;
	}

	public void setChildren(Person Child) {
		Children.add(Child);
	}

	public String getName() {
		return name;
	}

	public String[] getParents() {
		String names[]=new String[1];
		names[0]=Parents[0].getName();
		names[1]=Parents[1].getName();
		return names;
	}

	public String getChildren() {
		return("");
	}

}
