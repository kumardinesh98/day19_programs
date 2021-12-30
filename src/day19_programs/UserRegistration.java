package day19_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name ="^[A-Z]+[a-z]{3,}";
		Pattern fname = Pattern.compile(name);
		System.out.println("enter the name");
		String firstName = scanner.nextLine();
		Matcher pinmatcher = fname.matcher(firstName);
		if (pinmatcher.matches()) {
			System.out.println(firstName + " fine -valid");
		} else {
			System.out.println(firstName + " not valid");
		}
	}
	
}


