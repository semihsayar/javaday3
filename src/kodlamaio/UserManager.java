package kodlamaio;

public class UserManager {	
		public void readName(User user,BaseLogger logger) {
			System.out.println(user.getFirstName());	
			logger.log();
		}
		
}
