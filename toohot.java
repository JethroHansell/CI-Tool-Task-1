package TooHot;
import java.util.Scanner;

public class toohot {


public static void main(String[] args) {
	Scanner hotScanner = new Scanner(System.in);
	System.out.println("What is the temperature?");
	int num1 = hotScanner.nextInt();
	System.out.println("Is it summer?");
	boolean isSummer =hotScanner.nextBoolean();
	
	System.out.println(tooHot(num1,isSummer));
}

	
	public static String tooHot(int num1, boolean isSummer){
	
 if (num1 >=60 && ((num1<90 && isSummer==false)||(num1<100 && isSummer==true)))
		 {
 
	return "It is too hot";	
}

 else return "nope";

}
}