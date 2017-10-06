import java.util.Scanner;   //Scanner class to take input from user

public class FindLargestNumber {    //Class contains methods and functions
	
	public void LargestNumber()   //Method or Function to 
	{
		int FirstNumber = 10; 			//First initialized number 
		int SecondNumber = 76; 			//Second initialized number
		int ThirdNumber = 20;			//Third initialized number
	
		// Printing all the three variables value
		System.out.println("First Number is: "+ FirstNumber +"\n\nSecond Number is: "+ SecondNumber+"\n\nThird Number is: "+ ThirdNumber); 
		
		// Checking which number is largest using if condition
		if (FirstNumber > SecondNumber && FirstNumber > ThirdNumber ) {
			System.out.println("\nFirst is the largest number i.e. " + FirstNumber);  // Comparing First number with Second and Third
		}
		else if (SecondNumber > FirstNumber && SecondNumber > ThirdNumber) {
			System.out.println("\nSecond is the largest number i.e. " + SecondNumber);  //Comparing Second number with First and Third
		}
		else {
			System.out.println("\nThird is the largest number i.e. " + ThirdNumber);   //Else Third is the largest
		}
		}
	
	public static void main (String args[]) {
		FindLargestNumber FLN = new FindLargestNumber();   //Creating object "FLN" of class "FindLargestNumber" to call the method
		FLN.LargestNumber();    					//using above object, calling its method LArgestNumber() 
	}
}

