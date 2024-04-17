package login;

import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void loginPositivegrk31() {
		System.out.println("loginPositive grk31 executed");
	}
	
	@Test
	public void loginNegative() {
		System.out.println("loginNegative executed");
	}
	
	@Test
	public void loginStucked() {
		System.out.println("loginNegative is  stcuked");
	}

	@Test
	public void loginBondary() {
		System.out.println("loginBondary executed");
	}
	
	@Test
	public void logOut() {
		System.out.println("Executing logOut test case"); // my method
	}
	
	public int doAdditiona(int x, int y) {
		return x + y;
	}
}
