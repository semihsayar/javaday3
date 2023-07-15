package kodlamaio;

public class Instructor extends User { // eğitmen

	private String instructorNumber;
	
	public Instructor() {
		super();
	}

	public Instructor(int id, String firstName, String lastName, String image,String instructorNumber) {
		super(id, firstName, lastName, image);
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
}
