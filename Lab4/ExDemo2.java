import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

class ExDemo2{
	public static void main(String... args){
	  Scanner sc=new Scanner(System.in);
	  try{
	  	int x=sc.nextInt();
	  	int y=sc.nextInt();
	  	System.out.println(x/y);
	  }catch(InputMismatchException ime){
	  	System.out.println(ime.getMessage());
	  }catch(ArithmeticException ame){
	  	System.out.println(ame.getMessage());
	  }finally{
	  	System.out.println("Exception handled");
	  }

	}
}
// output is 8 4 2 Exception handled
