package practice;

public class ImmutableCheck {
	public static void main(String[] args) {
		
		Age age= new Age();
		age.setDay(1);
	    age.setMonth(1);
	    age.setYear(1992);
	    
	    ImmutableStudentwithMutable student = new ImmutableStudentwithMutable(1, "Alex", age);
	    System.out.println("Alex age year before modification = " + student.getAge().getYear());
	    age.setYear(1993);
	    System.out.println("Alex age year after modification = " + student.getAge().getYear());
		
	}
}
