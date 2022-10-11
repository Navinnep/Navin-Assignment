class Obj1

 {

    int engno;
    String brand;
    String color;
    float cost;
    
    void start(){
        System.out.println("bike is starting");
        
    }
    void stop(){
       System.out.println("bike is stop");
    }
	 void move(){
       System.out.println("bike is move");
    }

   public static void main(String[]args)
	{
	Obj1 b1 = new Obj1();
	Obj1 b2 = new Obj1();
	b1.start();
	b1.stop();
	b1.move();
	b2.start();
	b2.stop();
	b2.move();
	}

    
    
}
