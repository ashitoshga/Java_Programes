package strings_programs;

public class String_Find_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find if string contains only digit
		String str = "coforge123";
		String str2 ="";
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
			else
			{
				str2 = str2+str.charAt(i);
				
			}		
			
		}
		System.out.println(str2);

	}

}
