package diliuti;

import java.util.Scanner;

public class dihui {
	public static void mian(String []args)
	{
		System.out.println("����һ����");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		for(int j=i;j>0;j--)
		{
			i=i*(i-1);
			
		}
	}
}
