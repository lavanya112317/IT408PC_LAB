import java.util.Scanner;
import java.lang.ArithmeticException;
class ExDemo4 {
	public static void getValue(int x){
		if(x%2!=0){
			throw new ArithmeticException("odd number");
		}
		else{
			System.out.println(x);
		}
	}
	public static void main(String... args){
	Scanner sc=new Scanner(System.in);
	try{
	int a=sc.nextInt();
	getValue(a);
    }
    catch(Exception e){
    	System.out.println(e.getMessage());
    }
    }
}
// i/p=7 o/p=odd number
