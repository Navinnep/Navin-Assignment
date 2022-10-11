class Calculator

 {

    int a;
	int b;
	int c;
   
    
    
    void add(){
		c=a+b;
        System.out.println(c);
        
    }
    void sub(){
		c=a-b;
       System.out.println(c);
    }
	 void mul(){
		 c=a*b;
       System.out.println(c);
    }
	
    void div(){
		c=a/b;
        System.out.println(c);
	}
 }
 class CalculatorApp
 {
 
   public static void main(String[]args)
	{
	Calculator d=new Calculator();
	d.a=10;
	d.b=40;

	d.add();
	d.sub();
	d.mul();
	d.div();
	}

    
    
}
