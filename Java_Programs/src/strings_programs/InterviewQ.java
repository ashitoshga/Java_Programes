package strings_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class InterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\InterviewQ\\chromedriver_win32");           
//		WebDriver driver = new ChromeDriver();
//
//		  driver.get("http://www.google.com/"); 
		System.out.println(10+20+"Java"+10+20);	
		//OP....30Java1020
		System.out.println(10+20+"Java"+10*20);	
		//OP...30Java200
		System.out.println(10+20+"Java"+10*20);	
		//OP...200Java200
		
		//Find Prime number-the number divisible by 1 or itself
		primenumber(100);
		
		//to reverse a string
		reverse("Greeettat responsibility");
		
		//to print star pattern
		//pattern_addition("*****");
		pattern_substraction();
		
		//with input para
		pattern_substraction2("12345");
		
		//reverse each char in the string
		string_CharReverse("Welcome to JAVA");

	}
	
	static boolean bool=false;
	public static void primenumber(int a)
	{
		for(int i=2; i<a/2; ++i)
		{
			//prime num condition
			if(a%2==0)
			{
				//System.out.println("Given number is not a prime number" + a);
				bool=true; ///given number is prime number as remainder is 0 and divisible by 2
				break;				
			}
			else
			{
				//System.out.println("Given number is a prime number" + a);
				bool= false;				
			}			
		}
		if(bool==false)
		//	if(!bool)
		{
			System.out.println("Given number is a prime number" + a);
		}
			else
			{
				System.out.println("Given number is NOT a prime number" + a);
			}			
				
		
	}
	
	//s = "Greeettat responsibility";
	static int a = 0;
	static String ss ="";
	public static void reverse(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			if(s.charAt(i)==s.charAt(j))
			{
				a++;
				System.out.println("String match found");
				ss = ss+s.charAt(j);
				break;				
			}
		}
		System.out.println(ss);
		System.out.println("Duplicate characters found"+" "+a);
	
	}
	
	//s = "I love java"
	//reverse the string keeping blank spaces>>OP>>avaj evol I
	private static void reverseString_Whitespaces(String s) {
		
		//covert giving string to charArray and create a new char array to store final
		char[] ch = s.toCharArray();
		char[] result = new char[ch.length];
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]==' ')
			{
				System.out.println("Blankspace found");
				//keeping blankspaces in the new array
				result[i]=' ';
			}
		}
		
		//counting number of blankspaces
		int j=result.length-1;
		for(int i=0; i<ch.length; i++)
		{
			//finding remaining char without white spaces
			if(ch[i]!=' ')
			{
				j--;
			}
			result[j] = ch[i];
		}
		
	}
	
	//print start pattern
	//static String s = "*****";
	
	public static void pattern_addition(String s)
	{
		//for(int i=0; i<s.length(); i++)
		//{
			//System.out.println(s);
		String res="";
			for(int j=s.length()-1; j>=0; j--)
			{
				//System.out.println(s.charAt(j));
				res = res+s.charAt(j);
				System.out.println(res);
			}
			//System.out.println(res);
		//}			
	}
	
	public static void pattern_substraction()
	{
		//for(int i=0; i<s.length(); i++)
		//{
			//System.out.println(s);
		//String res="";
			for(int j=0; j<5; j++)
			{
				//System.out.println(s.charAt(j));
				//res = res+s.charAt(j);
				//
				//System.out.print("*");
				for(int i=4; i>=j; i--)
				{
					System.out.print("*");
					//break;
				}
				System.out.println();
			}
	}
	
	//String s = "12345"
	public static void pattern_substraction2(String s)
	{
		//for(int i=0; i<s.length(); i++)
		//{
			//System.out.println(s);
		//System.out.println(s.length());
		String res="";
		int counter = 0;
		
		//this loop is for next row
			for(int j=0; j<s.length(); j++)
			{
				//System.out.println(s.charAt(j));
				//res = res+s.charAt(j);
				//
				//System.out.print("*");
				
				//this loop is for columns in rows
				for(int i=s.length()-1; i>=j; i--)
				{
					//PRINTING first row from 1 to 5
					res = res+s.charAt(counter);
					System.out.print(res);
					
					//increased counter to get next char i.e. 2,3,4,5
					counter++;
					res="";
					//++j;
					//System.out.print(s.charAt(j));
					//break;
				}
				//System.out.print(res);
				//res="";
				
				//switching to next row
				//reseting counter to 0, to get value of 1,2,3,4 again
				counter=0;
				System.out.println();
			}
	}
	
	//pallidrome number/string
	//A palindrome number is a number that is same after reverse. 
	//For example 545, 151, 34543, 343, 171, 48984 , a string like LOL, MADAM
	
	public static void pallidrome_num(int a)
	{
		
	}
	
	//-String str = "My name is"
	//o/p---"yM eman si"
	
	public static void string_CharReverse(String s) 
	{
		//String sr = "My name is";
		//StringBuffer sbr = new StringBuffer(sr);
		//sbr.append(sr);
		//sbr.reverse();
		//System.out.println(sbr);
		//OP--si eman yM
		//OP--yM eman si
			
		//char[] charr = sr.toCharArray();
		String[] strarr = s.split(" ");
		int a = strarr.length;
		String finalstr = "";
		String revword = "";
		
		for(String item:strarr)
		{
			
			for(int i=item.length()-1; i>=0; i--)
			{
				//reversing each item from the array
				revword = revword+item.charAt(i);		
			
			}		
			//addding reversed item to make a reverse string
			finalstr = finalstr + revword + " ";
			//again erasing previous item
			revword = "";
		}
		
		System.out.println(finalstr);
		
		
	}

}
