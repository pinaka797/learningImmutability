package practice;
//simple Immutable Class
//these type of classes are normally used for caching purposes

public final class ImmutableStudent {
	
	private final int id;
	private final String name;
	
	public ImmutableStudent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}
