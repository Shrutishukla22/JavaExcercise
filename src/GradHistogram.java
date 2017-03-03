import java.util.Scanner;

public class GradHistogram {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		int grades=0;
		while (choice.equalsIgnoreCase("yes")) {
         
         printVerticalGradesHistogram(scan1, grades);
         }
			System.out.println("you want to continue?");
			choice = scan1.nextLine();
		}

	public static void printVerticalGradesHistogram(Scanner scan1, int grades) {
		for(int i=0;i<100;i++){
        	 System.out.println("please enter the number between 0 to 100 you want to see the grade for:");
             grades = scan1.nextInt();
             scan1.nextLine();
             if(grades==-1||grades>100){
            	 System.out.println("please enter between 0 and 100");
            	 break;
        	 }
        	if(grades>=0||grades<=9)
        	 System.out.println("0-9:***");
        	if(grades>=10||grades<=19)
        	System.out.println("10-19:***");
        	if(grades>=20||grades<=29)
            System.out.println("20-29:");
        	if(grades>=30||grades<=39)
                System.out.println("30-39:");
        	if(grades>=40||grades<=49)
                System.out.println("40-49:*");
        	if(grades>=50||grades<=59)
                System.out.println("50-59:*****");
        	if(grades>=60||grades<=69)
                System.out.println("60-69:");
        	if(grades>=70||grades<=79)
                System.out.println("70-79:");
        	if(grades>=80||grades<=89)
                System.out.println("80-89:*");
        	if(grades>=90||grades<=100)
                System.out.println("90-100:**");
         }
	}


	}



