package assign5;
import java.util.Scanner;


public class assign5 {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		int truepin = 1234;
		int pin;
		
			for( int i = 0; i<1000; i++ ) {
				if ( i<4 ){
				System.out.println("Please enter your PIN: ");
				pin = keyboard.nextInt();
			
				if (pin < 1000 && pin  > 9999){
					System.out.println("ERROR! PLEASE ENTER THE VALID PIN WITH 4 NUMBERS!");
				}
					else {
						if (pin == truepin){
							System.out.println("Correct PIN");
						break;
						}
						else{ 
						
							System.out.println("Try again");
							if (i>4){
								System.out.println("Try again later because you entered more than 3 times");
							}
							}
						  }
						}
				
			}
			
	}
}

		


