class Invfull
{
	public static void main(String args[]){
	for(int i=1;i<=6;i++)
	{
		for(int j=2;j<=i;j++)
		{
			System.out.print("  ");
		}
		for(int k=6;k>=i;k--)
		{
			System.out.print("*"+" ");
		}
		for(int k1=5;k1>=i;k1--)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
		
	}
	
}
}