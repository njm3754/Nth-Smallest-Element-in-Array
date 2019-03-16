import java.util.Scanner;

public class NthSmallestElement {
    public static void main(String[] args) {
  
        /* User input to find nth smallest element in an array */
    	Scanner input1 = new Scanner(System.in);  
        System.out.println("Enter nth number");
        int nth = input1.nextInt();
        input1.close();
        
        /* Sample Array */
        int[] array = {5, 7, 8, 4, 3, 2, 9, 10, 50, 1};
        
        int upperlimit = 10000000;
        int lowerlimit = -10000000;
        
        
        for(int i = 0; i < nth; i++) {
        	
        	upperlimit = 10000000;
        	for(int j = 0; j < array.length; j++) {
        		
        		if(upperlimit > array[j] && array[j] > lowerlimit) 
        		{
        			upperlimit = array[j];
        		}

        	}

        	lowerlimit = upperlimit;
        }
        
	    System.out.println("The nth smallest element in an array is: " + upperlimit);
    }
    
}
