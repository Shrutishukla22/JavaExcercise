import java.util.Scanner;

public class Number_To_English {
	public String[]specialNames={"","thousand","million","billion","trillion"};		                      
	public String[] tenNames={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
    public String[] numNames={"","one","two","three","four","five","six","seven","eighty","nine","ten",
    		"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
    public String convertLessThanThousand(int number){
    	String current="";
    	if(number%100<20){
    	current = numNames[number%100];
    	number/=100;
    	}
    	else{
    		current = numNames[number%10];
    		number/=10;
    		current = tenNames[number%10]+current;
    		number/=10;
    	}
    	if(number==0)
    		return current;
    	else return numNames[number] +" hundred "+ current;
    }
    public String convert(int number){
    	if(number==0)return "zero";
    	String prefix="";
    	if (number<0){
    		number =-number;
    		prefix="negative";
    		}
    	String current="";
    	int place =0;
    	while(number>0){
    	int n=number%1000;
    	if(n!=0){
    		String str = convertLessThanThousand(n);
    		current = str+ " " +specialNames[place]+ " " +current;
    	}
    	place++;
    	number/=1000;
    	}
    	return (prefix + current).trim();
    	
  }
    
	public static void main(String[] args) {
		Number_To_English numtoen=new Number_To_English();
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {	
       System.out.println("enter a number you want to write in english");
             int input=scan1.nextInt();
             scan1.nextLine();
            System.out.println("***"+numtoen.convert(input)); 
			System.out.println("you want to continue?");
			choice = scan1.nextLine();
		}


	}

}
