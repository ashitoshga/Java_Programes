package strings_programs;

public class BlankSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove the blank spaces from the string
		String str = "ABC ABC ABC ABC "; 
		//use replace method to remove the white space
		String Final = str.replaceAll("\\s+", "");
		System.out.println(Final);
	}

}
