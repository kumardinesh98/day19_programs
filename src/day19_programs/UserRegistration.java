package day19_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String validName ="^[A-Z]+[a-z]{3,}";
		Pattern compiledName = Pattern.compile(validName);
		UserRegistration userRegistration = new UserRegistration();
		System.out.println("enter the name");
		String firstName = scanner.nextLine();
		userRegistration.check(compiledName, firstName);
		System.out.println("enter last name");
		String secondName = scanner.nextLine();
		userRegistration.check(compiledName, secondName);
	}
	
	public void check(Pattern con, String name) {
		Matcher pinmatcher = con.matcher(name);
		if (pinmatcher.matches()) {
			System.out.println(name + " fine");
		} else {
			System.out.println(name + " not valid");
		}
	}
}
