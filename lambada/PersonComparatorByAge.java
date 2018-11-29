package lambada;

import java.util.Comparator;

//creating comparator as a class [instead of anonymous/lambda]
public class PersonComparatorByAge implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {		
		if (o1.getAge() > o2.getAge())
			return 1;
		if (o1.getAge() == o2.getAge())
			return 0;
		return -1;
		
	}

}