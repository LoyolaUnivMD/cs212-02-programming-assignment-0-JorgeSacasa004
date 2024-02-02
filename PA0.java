import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("How many people will infect the virus daily? ");
		double R = scan.nextInt();
		double totalCases = 1;
		int count = 0;
		System.out.print("day        Cases\n");  
		while (count < 10){
		    if (count == 0 ){
		        System.out.print("0          " + totalCases +"\n");
		        count += 1;
		    }
		    else{
		        double calculation = (R * totalCases)+ 1;
		        totalCases = calculation;
		        System.out.print(count + "          " + calculation + "\n" ); 
		        count += 1;
		    }

		}
		
	}
}
