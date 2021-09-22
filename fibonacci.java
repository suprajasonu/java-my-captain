import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {

		int input,a=0,b=1,c=0,i=2;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the range :-");
		input=n.nextInt();
		if(input<=0) {
			System.out.println("*********** Take input from 1 **********");
		}
		else if(input==1){
			System.out.println(a);
		}
		else if(input==2) {
			System.out.print(a + "    " + b + "    ");	
		}
		else
			System.out.print("\n" + a + "    " + b + "    ");

		while(i<input) {

			c=a+b;
			System.out.print(c + "    ");
			a=b;
			b=c;
			i++;


		}

	}
}