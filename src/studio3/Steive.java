package studio3;
import java.util.Scanner;
public class Steive {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What number would you like to sieve?");
		int number = in.nextInt();
		int[] numberArray = new int[number-1];
		int[] primeArray = {2};
		int[] check = new int[1];
		for(int i=0;i<number-1;i++)
		{
			numberArray[i] = i+2;
		}
		for(int c=0;c<primeArray.length-1;c++)
		{
		for(int i=0;i<number-1;i++)
		{
			for(int o = 0; o<primeArray.length; o++)
		{
				check[c] = numberArray[i]% primeArray[o];
				
		
		}
			int checkSum = 0;
					
			for(int s = 0; s<check.length; s++)
			{
				checkSum = checkSum + check[s];
			}
			if(checkSum != 0)
			{
				int[] primeCopy = new int[primeArray.length + 1];
				System.arraycopy(primeArray,0,primeCopy,0,primeCopy.length);
				primeCopy[primeCopy.length-1] = numberArray[i];
				primeArray = primeCopy;
				int[] checkCopy = new int[check.length + 1];
				System.arraycopy(check,0,checkCopy,0,checkCopy.length);
				check = checkCopy;
			}
			for(int p =0; p<check.length; p++ )
			{
				check[p]=0;
			} 
		}
		
		}
		for(int i = 0; i<primeArray.length;i++)
		{
			System.out.println(primeArray[i]);
		}
	}

}
