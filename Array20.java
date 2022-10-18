import java.util.*;
class Array20

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the class");
		int a=scan.nextInt();
		int [][] arr= new int[a][];
		int stud;
		for (int i=0;i<=arr.length-1 ;i++ )
		{
			System.out.println("enter the student in class "+(i+1));
			stud=scan.nextInt();
			arr[i]=new int[stud];
		
			

		}
		
	for (int i=0;i<=arr.length-1 ;i++ )
	{
		for (int j=0;j<=arr[i].length-1;j++)
		{
			
		
				System.out.println("  class  "+(j+1)+"  school  "+(i+1));
				arr[i][j]=scan.nextInt();

			

		}
	}
	
	System.out.println("student ages are ");

	for (int i=0;i<=arr.length-1 ;i++ )
	{
		for (int j=0;j<=arr[i].length-1;j++)
		{
				
		   System.out.print(arr[i][j]+" ");


		}
	System.out.println();
		
	}

	}
}
