import java.util.*;
class Array30

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of  school");
		int a=scan.nextInt();
		int [][][] arr= new int[a][][];
		
		for (int i=0;i<=arr.length-1 ;i++ )
		{
			System.out.println("enter the class in school   "+(i+1));
			int clas=scan.nextInt();
			arr[i]=new int[clas][];
		
			

		}

		for (int i=0;i<=arr.length-1 ;i++ )
		{

		  for (int j=0;j<=arr[i].length-1 ;j++ )
			{
			System.out.println("enter the no of student in class  "+(j+1)+"  in school  "+(i+1));
			int stud=scan.nextInt();
			arr[i][j]=new int[stud];
		    }
			

		}
	for (int i=0;i<=arr.length-1 ;i++ )
	{
		for (int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("student "+(k+1)+"   class  "+(j+1)+"  school  "+(i+1));
				arr[i][j][k]=scan.nextInt();

			}

		}
	}
	
	System.out.println("student ages are ");

	for (int i=0;i<=arr.length-1 ;i++ )
	{
		for (int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.print(arr[i][j][k]+" ");


			}
			System.out.println();
		

		}

	}

		


		
	}
}