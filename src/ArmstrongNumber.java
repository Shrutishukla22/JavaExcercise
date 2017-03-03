import java.util.Scanner;
import java.util.Stack;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		Stack<Integer>stack=new Stack<>();
		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("please enter the number to find out if it is Armstrong:");
                String inputNumber=scan1.nextLine();
                int number1=0,number2=0,number3=0; double cube1=0.0,cube2=0.0,cube3=0.0;
                pushingInStack(stack, inputNumber);
               number3= stack.pop(); 
               number2=stack.pop();
               number1=stack.pop();
               cube1=Math.pow(number1, 3);
               cube2=Math.pow(number2, 3);
               cube3=Math.pow(number3, 3);
               boolean isArmstrong = checkArmstrong(inputNumber, cube1, cube2, cube3);
                System.out.println(isArmstrong);
                	
			System.out.println("you want to continue?");
			choice = scan1.nextLine();
		}

	}

	public static boolean checkArmstrong(String inputNumber, double cube1, double cube2, double cube3) {
		boolean isArmstrong;
		if (cube1+cube2+cube3==Integer.parseInt(inputNumber))
			isArmstrong =true;
		else
			isArmstrong=false;
		return isArmstrong;
	}

	public static void pushingInStack(Stack<Integer> stack, String inputNumber) {
		for(int i=0;i<inputNumber.length();i++){
			int number=Character.getNumericValue(inputNumber.charAt(i));
			stack.push(number);
			
		}
	}

}
