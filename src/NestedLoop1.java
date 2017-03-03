
public class NestedLoop1 {

	public static void main(String[] args) {
          System.out.println("(a)");
		for (int i = 1; i < 9; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		 System.out.println("(b)");
		for (int i = 8; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		 System.out.println("(c)");
		for(int i=0;i<=8;i++){
			for(int space=7;space>=i;space--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("---------------------------");
		 System.out.println("(d)");
		for(int i=0;i<=8;i++){
			for(int space=1;space<=i;space++){
				System.out.print(" ");
			}
			for(int j=8;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
