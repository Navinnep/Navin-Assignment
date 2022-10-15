import java.util.Scanner;
class Reverse_1 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner (System.in);
		System.out.println("enter the array length");
		int  a = scan.nextInt();
		int [] b = new int[a];
		int [] c =new int[a];
		for (int i=0;i<=b.length-1 ;i++ )
		{
			b[i]=scan.nextInt();
		}
		for (int i=0;i<=b.length-1 ;i++ )
		{
			c[i]=b[i];
		}
		for (int i=0;i<=b.length-1 ;i++ )
		{
			System.out.print(b[i]+" ");


		}
		System.out.println();


		for (int i=0;i<=b.length-1 ;i++ )
		{
			System.out.print(c[i]+" ");
		}
        System.out.println();
	
	}
}
