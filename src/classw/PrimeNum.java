package classw;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		if ((n & 1)==1)
		{
			System.out.println("given num is odd ");
		}
		else
		{
			System.out.println("it is even number");
		}
	}

}
  