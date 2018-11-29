package lambada;

import java.util.Comparator;

//creating comparator as a class [instead of anonymous/lambda]
public class PersonComparatorByName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {		
		
		return o1.getName().compareTo(o2.getName());

	}

}
