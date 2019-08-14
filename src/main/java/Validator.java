
public class Validator {

	

	public static void validate(String name) {
		if (name == null || name.equals("")) {
			System.out.println("Invalid Name");
		}
		else {
			System.out.println("Valid name");
		}
	}
}
