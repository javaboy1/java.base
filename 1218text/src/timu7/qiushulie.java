package timu7;

import java.util.Scanner;

public class qiushulie {
public static void main(String[] args) {
	
	int a[]=null;
	int b[]=null;
	System.out.println("输入一个数");
	Scanner sc=new Scanner(System.in);
	int j=sc.nextInt();
	for(int i=0;i<1000;i++)
	{
		a[i]=i;
		b[i]=a[i]+a[i+1];
        System.out.println(""+a[i]);
	}
}
}
