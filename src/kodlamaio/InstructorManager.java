package kodlamaio;

public class InstructorManager extends UserManager {

	public void readLastName(User user,BaseLogger logger) {
		System.out.println(user.getLastName());
		logger.log();
	}
}
