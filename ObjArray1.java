import java.util.Scanner;
/*class ObjArray 
{
	String name; 
	int salary;
	int id;

	void work()
	{
       System.out.println("student is working");
	}
	void study()
	{

	}
}*/
class ObjArray1
{
	public static void main(String[]args)
	{
	  ObjArray s1=new ObjArray();
	  
	  ObjArray s2=new ObjArray();
	  
	  ObjArray s3=new ObjArray();

	  ObjArray s4=new ObjArray();

	Scanner scan =new Scanner (System.in);
	ObjArray [] a = new ObjArray[4];
	a[0]=s1;
	a[1]=s2;
	a[2]=s3;
	a[3]=s4;
	for (int i=0;i<a.length-1;i++ )
	{    
		System.out.println("enter the name");
		 a[i].name=scan.next();
		 
		System.out.println("enter the salary");

		 a[i].salary=scan.nextInt();


	}
	for (int i=0;i<a.length-1;i++ )
	{
	System.out.println(a[i].name+" "+a[i].salary);
	}

	}
}