package qaprogramme;


//Same name different arguments
public class MethodOverLoading {

	//No arguments
	public void Login() {
		System.out.println("Login to application");
	}
	//Data type is different
	public void Login(String Username, int password) {
		System.out.println("Enter UserName "+ Username + " Enter Password " + password);
	}
	//Data type sequence is different
	public void Login(int password, String Username) {
		System.out.println("Enter UserName "+ password + " Enter Password " + Username);
	}
	//Same datatype as argument
	public void Login(String Username, String password) {
		System.out.println("Enter UserName "+ Username + " Enter Password " + password);
	}
	//Argument count is different
	public void Login(String Username, String password, double passcode ) {
		System.out.println("Enter UserName "+ Username + " Enter Password " + password + " Enter Passcode "+ passcode);
	}

	public static void main(String[] args) {
		MethodOverLoading overload = new MethodOverLoading();
		overload.Login();
		overload.Login("Test", 123);
		overload.Login(111, "Test");
		overload.Login("TestUsername", "TestPassword");
		overload.Login("TestUsername", "TestPassword", 222);
		

	}

}
