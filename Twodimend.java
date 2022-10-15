import java.util.Scanner;
class Twodimend 

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int [][] a = new int [2][];

		a[0]=new int[4];
		
		a[1]=new int[3];
		
		
	  
		
		
		

	for (int i=0;i<=a.length-1 ;i++ )
	{
		for (int j=0;j<=a[i].length-1;j++)
		{
			
		
				System.out.println("  class  "+(j+1)+"  school  "+(i+1));
				a[i][j]=scan.nextInt();

			

		}
	}
	
	System.out.println("student ages are ");

	for (int i=0;i<=a.length-1 ;i++ )
	{
		for (int j=0;j<=a[i].length-1;j++)
		{
				
		   System.out.print(a[i][j]+" ");


		}
	System.out.println();
		

		
	}

	}
}
