package decodertest1;

import java.util.Scanner;

public class DTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=s.nextInt();
		System.out.println("enter the string");
		String s1=s.next();
		String s2="";
		String s3="";
		String s4="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		System.out.println(s2);
			for (int i=s2.length()-1;i>=0;i--)
			{
				if (n>0)
				{
				   char ch1=s2.charAt(i);
				   s3=s3+ch1;
				   n--;
				}
			}
			for (int i=s3.length()-1;i>=0;i--)
			{
		        char ch2=s3.charAt(i);
		        s4=s4+ch2;
			}
			System.out.println(s4);
	}

}
