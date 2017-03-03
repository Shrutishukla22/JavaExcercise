import java.util.Scanner;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {
          
			System.out.println("please enter the number you wwnt to check:");
			String input = scan1.nextLine();
			      boolean isArmstrong;
			 checkArmstrongNumber(input);
			
			System.out.println("you want to continue?");
			choice = scan1.nextLine();
		}


	}

	public static void checkArmstrongNumber(String input) {
		int number; int sum=0;
		boolean isArmstrong;
		for(int i=0;i<input.length();i++){
			number=Character.getNumericValue(input.charAt(i));
			sum=sum+(number*number*number);
		 }
		 if(sum==Integer.parseInt(input))
		 isArmstrong=true;
		 else
		 isArmstrong=false;
		 System.out.println(isArmstrong);
	}

}
