package javaclasses;
import java.util.*;
public class count_divisor 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting number");
		int l=sc.nextInt();
		System.out.print("Enter the last number");
		int r=sc.nextInt();
		System.out.print("Enter the K divide value");
		int k=sc.nextInt();
		int m=((r/k)-((l-1)/k));
		System.out.print(m+" number is divided by "+k+" in range "+l+" "+r+" here");
	}

}
