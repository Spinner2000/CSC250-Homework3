import java.util.Scanner;
public class Homework3 {
	public static void main(String[] args) {
	
		Scanner myObj = new Scanner(System.in);
	
		//Interface
		Integer decimal;
		System.out.println("Please Enter A Decimal Number: ");
		decimal=myObj.nextInt();
		String binary="";
		String binary2="";
	
		//Conversion
		while(decimal>0) {
			if(decimal%2==0) {
				binary=(binary+"0");
				decimal=decimal/2;
			}
			else {
				binary=(binary+"1");
				decimal=decimal/2;
			}
		}
		//Reverse String
		for(int i=binary.length()-1;i>=0;i--) {
			binary2=binary2+binary.charAt(i);
		}
		
		System.out.println("The Binary Form is: "+binary2);
	}
}
