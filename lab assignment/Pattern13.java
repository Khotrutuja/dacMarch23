class Pattern13{
public static void main(String args[]){

for(int i=1;i<=5;i++)
	{
	int a=64;
		for(int j=5;j>=i;j--)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
		System.out.print((char)(a+i)+" ");
		}
		System.out.println();
	}
}
}