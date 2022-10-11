import java.util.Scanner;
class Assignment1 
{
    public static void main(String[] args) 
	{
		Scanner a =new Scanner(System.in);
		float[] b = new float[3];
		String[]c=new String[3];
			for (int i=0;i<=b.length-1 ;i++ )
			{
			   System.out.println("enter the  "+(i+1)+"  student height");
			   b[i]=a.nextFloat();

			}
			for (int i=0;i<=b.length-1 ;i++ )
			{
			   System.out.println("enter the  "+(i+1)+"  student name");
			   c[i]=a.next();

			}

			System.out.println("student name and height ");
			for (int i=0;i<=b.length-1 ;i++ )
			{
			   System.out.println(c[i]+"  ;  " +b[i]);
			   

			}
	}
}

