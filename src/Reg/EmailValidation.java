package Reg;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String email1="firstname@gmail.com";
		String email2="sangamesh@gmail.com";
		String email3="test123@gmail.com";
		
		System.out.println("email1= " +validateEmail(email1));
		System.out.println("email2= " +validateEmail(email2));
		System.out.println("email3= " +validateEmail(email3));	
	}
	public static String validateEmail(String email) {
		if(email==null || email.isEmpty()) {
			return "valid";
		}
		Pattern pattern;
		String emailRegex="^[a-zA-z0-9+_.-]+@[a-zA-Z0-9.-]+$";
				Pattern pattern1 =Pattern.compile(emailRegex);
		if(pattern1.matcher(email).matches()){
			return"valid";
		}else {
			return"not valid";
		}
			
	}

}
