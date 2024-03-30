package generic;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			throw new Custom_Exceptions("custom exception msg");
		}
		catch(Custom_Exceptions e)
		{
			System.out.println("in 1st catch block");			;
			System.out.println(e.getMessage());			
		}
		try
		{
			throw new Custom_Exceptions();
		}
		catch(Custom_Exceptions e)
		{
			System.out.println("in 2nd catch block");			
			System.out.println(e.getMessage());			
		}


	}

}
