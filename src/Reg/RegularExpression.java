package Reg;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
			System.out.println(Pattern.matches("\\D*@gmail.com","firstname@gmail.com"));
			System.out.println(Pattern.matches("\\D*@gmail.com","virendra@gmail.com"));
			System.out.println(Pattern.matches("\\D*@gmail.com","test123prepare@co.edu.com"));
			System.out.println(Pattern.matches("91\\d{10}","918884897398"));
			System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z0-9]{6}","R1238jug0j"));



	}

}
