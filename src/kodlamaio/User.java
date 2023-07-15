package kodlamaio;

public class User { // kullanıcı

	private int id;
	private String firstName;
	private String lastName;
	private String image;

	public User() {

	}

	public User(int id, String firstName, String lastName, String image) {

		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
