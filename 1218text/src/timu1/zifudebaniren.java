package timu1;

public class zifudebaniren {
	public static void main(String[] args) {
		
	
String str[]={"3","2","4","2","~","@","~",".",".",".","C","f","x","d","X","B","g","3","A","a","s","d","f","4"};
int shuzi=0;
int xz=0;
int dz=0;
int other=0;
String shuziStr[]={"0","1","2","3","4","5","6","7","8","9"};
String xiaoxieStr[]={"a","b","c","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
String daxieStr[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
for(int i=0;i<str.length;i++)
{
	for(int j=0;j<shuziStr.length;j++)
	{ 
	if(str[i]==shuziStr[j])
	{
		shuzi=shuzi+1;
	}
	}
}
	
	for(int h=0;h<str.length;h++)
	{
		for(int k=0;k<xiaoxieStr.length;k++)
		{
	
        if(str[h]==xiaoxieStr[k] )
	{
		xz=xz+1;
	}
		}
	}
	for(int l=0;l<str.length;l++)
	{
		for(int q =0;q<daxieStr.length;q++)
		{
			if(str[l]==daxieStr[q])
	{
		dz=dz+1;
	}
other=str.length-dz-xz;
}
}
System.out.println("数字个数为："+shuzi);
System.out.println("小写字母个数为:"+xz);
System.out.println("大写字母个数为"+dz);
System.out.println("其他字符个数为"+other);

}
}
