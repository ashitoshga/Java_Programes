package strings_programs;

public class Duplicate_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Greeettat responsibility";
		//find the duplicate char in the string
		String str2="";	
		int counter = 0;	
		//int counter2=0;
		
		for(int i =0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length()-1; j++)
			{
				if(str.charAt(i) == str.charAt(j))
						{
					//eeeee										
					str2 = str2+str.charAt(j);			
			
					counter++;
					break;					
						}			
			//System.out.println("Number of duplicates found are" +" "+counter);
			}
		}
		System.out.println("The duplicate characters in the string are" +" "+ str2);
		System.out.println("Number of duplicates found are" +" "+counter);
	}
}
