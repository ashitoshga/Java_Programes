package integer_programs;

public class Pallindrone_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1--using integer
		int n = 454;
		int temp;
		int sum=0;
		int remain;
		
		temp=n;
		while(n>0)
		{
			remain = n%10;
			System.out.println(remain);
			sum = (sum*10)+remain;
			System.out.println(sum);
			n=n/10;	
			System.out.println(n);
		}
		if(temp==sum)
		{
			System.out.println("The given num is Pallindrone");
		}
		else
		{
			System.out.println("The given num is NOT Pallindrone");
		}
		
		//2--using string
		String given = "454";
		String reverse = "";
		for(int i=given.length()-1; i>=0; i--)
		{
			reverse = reverse+given.charAt(i);
		}
		if(given.equals(reverse)) 
		{
			System.out.println("Given string/number is a palindrome");
		}
		else
		{
			System.out.println("Given string/number is NOT a palindrome");
		}
		

	}

}
