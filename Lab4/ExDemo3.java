import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class ExDemo3{
	public static void main(String... args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader s=new BufferedReader(isr);
			int x=Integer.parseInt(s.readLine());
			int y=Integer.parseInt(s.readLine());
			System.out.println(x/y);
	}
}
// output is 2
