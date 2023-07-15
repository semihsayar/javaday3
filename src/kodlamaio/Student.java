package kodlamaio;

public class Student extends User { // öğrenci

	private String studentNumber;

	public Student() {
		super();
		
	}

	public Student(int id, String firstName, String lastName, String image,String studentNumber) {
		super(id, firstName, lastName, image);
		this.studentNumber = studentNumber;
		
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
}
