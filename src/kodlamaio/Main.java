package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setInstructorNumber("12345");
		instructor.setImage("images1");
		
		Instructor instructor2 = new Instructor(2,"Semih","Sayar","image2","67891");
		
		
		Student student = new Student();
		student.setId(3);
		student.setFirstName("Ahmet");
		student.setLastName("Çakar");
		student.setStudentNumber("65478");
		student.setImage("image3");
		
		Student student2 = new Student(4,"Sinan","Engin","image4","98745");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.readName(instructor2, new FileLogger());
		
		StudentManager studentManager = new StudentManager();
		studentManager.readName(student2, new DatabaseLogger());
		
		
	
	}

}
