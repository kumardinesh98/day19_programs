package day19_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner scanner = new Scanner(System.in);
		String validName ="^[A-Z]+[a-z]{3,}";
		Pattern compiledName = Pattern.compile(validName);
		System.out.println("enter the name");
		String firstName = scanner.nextLine();
		userRegistration.check(compiledName, firstName);
		System.out.println("enter last name");
		String secondName = scanner.nextLine();
		userRegistration.check(compiledName, secondName);
		userRegistration.email();
	}
	public void email() {
		System.out.println("enter email id");
		String emailId = scanner.nextLine();
		String validEmail = "^abc+.[a-z]*[@bl.co]+[.a-z]+";
		Pattern compiledName = Pattern.compile(validEmail);
		Matcher pinmatcher = compiledName.matcher(emailId);
		if (pinmatcher.matches()) {
			System.out.println(emailId + " is fine");
		} else {
			System.out.println(emailId + " not valid");
		}
	}
	
	public void check(Pattern con, String name) {
		Matcher pinmatcher = con.matcher(name);
		if (pinmatcher.matches()) {
			System.out.println(name + " is fine");
		} else {
			System.out.println(name + " not valid");
		}
	}
}
