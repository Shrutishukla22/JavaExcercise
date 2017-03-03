import java.util.Scanner;

public class MorseCodeToEnglish {

	public static void main(String[] args) {
		 Scanner scan1 = new Scanner(System.in);
		 Morse	morse	= new Morse();
		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("please enter english sentense you want to convert in morse code");
			String message =scan1.nextLine();
			System.out.println(message + "= " + morse.encode(message));
			System.out.println("you want to continue?");
			choice = scan1.nextLine();
		}


	}

}
