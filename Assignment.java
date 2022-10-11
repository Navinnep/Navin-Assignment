import java.util.Scanner;

class Assignment 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		float[][] a=new float[2][2];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.println("heigth of player "+(j+1)+" team "+(i+1));
				a[i][j]=scan.nextFloat();
				
			}
		}
		System.out.println("team players heigth");

		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
				
				
				
			}

		System.out.println();
		}

	}
}
