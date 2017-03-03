
public class NestedLoop2 {

	public static void main(String[] args) {
		System.out.println("(a)");
		for(int i=0;i<=6;i++){
			for(int j=0;j<=6;j++){
				if(i==0||i==6){
					System.out.print("*");
				}
				else if(j==0||j==6){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
     System.out.println("----------------------------------"); 
     System.out.println("(b)");
     for(int i=0;i<=6;i++){
    	 for(int j=0;j<=6;j++){
    		 if (i==0||i==6){
    			 System.out.print("*");
    		 }
    		 else if(i==j){
    			 System.out.print("*");
    		 }
    		 else{
    			 System.out.print(" ");
    		 }
    	 }
    	 System.out.println();
     }
     System.out.println("----------------------------");
     System.out.println("(c)");
     for(int i=0;i<=6;i++){
    	 for(int j=0;j<=6;j++){
    		 if (i==0||i==6){
    			 System.out.print("*");
    		 }
    		 else if(j==6-i){
    			 System.out.print("*");
    		 }
    		 else{
    			 System.out.print(" ");
    		 }
    	 }
    	 System.out.println();
     }
     System.out.println("------------------------");
     System.out.println("(d)");
     for(int i=0;i<=6;i++){
    	 for(int j=0;j<=6;j++){
    		 if (i==0||i==6){
    			 System.out.print("*");
    		 }
    		 else if(i==j||j==6-i){
    			 System.out.print("*");
    		 }
    		 else{
    			 System.out.print(" ");
    		 }
    	 }
    	 System.out.println();
     }
     System.out.println("---------------------------");
     System.out.println("(e)");
     for(int i=0;i<=6;i++){
			for(int j=0;j<=6;j++){
				if(i==0||i==6){
					System.out.print("*");
				}
				else if(j==0||j==6){
					System.out.print("*");
				}
				 else if(i==j||j==6-i){
	    			 System.out.print("*");
	    		 }
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
     System.out.println("----------------------------");
    System.out.println("(f)");
    /* int n=5;
     int k=1;
     int c;
     for(int i=0;i<n;i++){
    	 if(i<(n+1)/2){
    		 c=i+k;
    		 k++;
    	 }
    	 else{
    		 c=k-i+(n-3);
    		 k--;
    	 }
    	 for(int j=0;j<c;j++){
    		 System.out.print("*");
    		  		 
    } 
    	 System.out.println();
     }*/
    int n=7;
    for (int i = 1; i <=n; i=i+2) {
		for (int j = 0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
    for (int i =n-2; i > 0; i=i-2) {
		for (int j =i; j > 0; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	}

}
