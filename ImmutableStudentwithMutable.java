package practice;

/***
 * 
 * Immutable classes provide a lot of advantages especially when used correctly in a multi-threaded environment.
 *  The only disadvantage is that they consume more memory than the traditional class since upon each modification 
 *  of them a new object is created in the memory... but, a developer should not overestimate the memory consumption 
 *  as its negligible compared to the advantages provided by these type of classes.
 */

public final class ImmutableStudentwithMutable {
	
	private final int id;
	private final String name;
	private final Age age;
	
	public ImmutableStudentwithMutable(int id, String name, Age age) {
	
		this.id = id;
		this.name = name;
		Age cloneAge= new Age();
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());
		
		this.age = cloneAge;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		Age cloneAge = new Age();
	    cloneAge.setDay(this.age.getDay());
	    cloneAge.setMonth(this.age.getMonth());
	    cloneAge.setYear(this.age.getYear());
	    return cloneAge;
	}
		

}


 
