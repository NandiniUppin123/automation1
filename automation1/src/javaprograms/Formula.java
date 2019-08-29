package javaprograms;

import java.util.Scanner;



public class Formula {

	public static void main(String[] args) {
		int result=0,mul=1;
		System.out.println("Enter your value:");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		System.out.println("Ether the power");
		System.out.println();
		int power=sc.nextInt();
		for(int i=1;i<=power;i++)
		{
			/*for(int j=1;j<=i;j++)
			{*/
				mul=mul*value;
			/*}*/
		}
		//result=1+sum;
		System.out.println("Power of entered number:"+ mul);
	
	}

}
