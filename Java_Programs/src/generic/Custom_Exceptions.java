package generic;

public class Custom_Exceptions extends Exception{
	
	//to use custom exception as per business logic, 
	//ex. when you want to show user a valid exception message
	//simple create a new class that extends Exception class and use getmessage() from that class
	//In Test class, create a object of this custom exception class and handle it in try-catch
	//try---throw new Custom_Exceptions();--it will create an obj
	//catch(Custom_Exceptions ex) 
	//ex.getmessage();---with null value or custom message with Super
	
	public Custom_Exceptions (String s)
	{
		super(s);
		//you can pass custom message to parent class(Exception) 
		//getmessage("custom msg") will show
	}
	public Custom_Exceptions ()
	{
		//getmessage() method from Exception class will show null value when invoked
	}
	

}
