package newdemo;

public class March {
	
	int a=10;   // instance variable
	
	static int b=20;  // static variable
	
	
		
	void money(int c){         // local variable
       int d=40;
	
	}
	
	public static void main(String[] args) {
		March obj=new March();
		
		System.out.println(obj.a);    // instance
		System.out.println(March.b);   // static
	    obj.money(200);
		
		
	}

}
