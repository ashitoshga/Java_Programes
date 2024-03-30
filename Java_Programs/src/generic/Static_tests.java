package generic;

public class Static_tests {
	//-Parent class
	
	//public static void
	//static public void
	//NOT POSSIBLE--void public static
	//NOT POSSIBLE--public void static
	//order of void and method name should NOT be changed  
	//anything before void can be change, void should always followed by MethodName
	//same for class name as well after class keyword it should always follow classname
	
	 static public void display()
	{
		System.out.println("display() from Static_tests-parent class");
	}

	 public void show_nonStatic()
	{
		System.out.println("show_nonStatic() from Static_tests-parent class");
	}

}

//Another class-Child class
class Child extends Static_tests{
	
	 static public void display()
	{
		System.out.println("display() from Child class");
	}	
	 public void show_nonStatic()
	{
		System.out.println("show_nonStatic() from Child class");
	}
}

//Another class-Test class that implements methods from Parent and child
class Test{
	
	public static void main(String[] args)
	{
		//obj1--ref var of Parent
		Static_tests obj = new Static_tests();
		obj.display();
		obj.show_nonStatic();		
		
		 Static_tests obj1 =  new Child();		 
		 obj1.display();
		 obj1.show_nonStatic();
		 
		//obj2--ref var of Child
		 Child obj2 =  new Child();
		 obj2.display();
		 obj2.show_nonStatic();
		 
		 System.out.println("In Main method of Test class");
	}	
}
