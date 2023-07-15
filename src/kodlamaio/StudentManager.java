package kodlamaio;

public class StudentManager extends UserManager {
	
	public void readLastName(User user,BaseLogger logger) {
		System.out.println(user.getLastName());
		logger.log();
	}
}
