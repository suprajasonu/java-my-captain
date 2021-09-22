import java.util.*;
class Prime
{
   public static void main(String[] args){		
	int temp;
	boolean PrimeNum=true;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=s.nextInt();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      PrimeNum=false;
	      break;
	   }
	}
	if(PrimeNum)
	   System.out.println(num + " Prime Number");
	else
	   System.out.println(num + " Not A Prime Number");
   }
} 