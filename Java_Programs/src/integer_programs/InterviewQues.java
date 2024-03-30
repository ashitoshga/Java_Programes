package integer_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewQues {
	
	
	//a number that remains the same when its digits are reversed
	//11, 121, 55, 111
	public static boolean pallindrome_number(int a)
	{
		//int n = a;
		int sum=0;
		int temp;
		int remain;
		
		//take input number into temp var
		//reverse the number
		//check the reverse num with temp var	
		//if both are same then print OK else KO
		//spilt the given num using Remainder and division by 10
		
		temp=a;
		while(a>0)
		{
			remain = a%10;   //taking out remainder i.e last digit-1
			 sum = (sum*10)+remain;  //storing value of last digit into temp2 (value 1)
			 a=a/10;    //taking out first two digit (value is 12)			 
		}
		
		if(temp==sum)
		{
			System.out.println("Given number is Pallindrone");
			return true;
		}
		else
		{
			System.out.println("Given number is NOT Pallindrone");
			return false;
		}
		 
		
		
		
	}
	
	int target = 9;
	static int[] arr1 = {3,6,13,15};
	public static int[] indexOfsum(int[] arr1, int target)
	{
		int a = 0;
		int b = arr1.length-1;
		while(arr1[a]<arr1[b])
		{
			if(arr1[a]+arr1[b]==target)
			{
				System.out.println("match found");
				System.out.println(arr1[a]);
				System.out.println(arr1[b]);
				return new int[] {arr1[a], arr1[b]};
			}
			else if (arr1[a]+arr1[b]<target)
			{
				b++;
			}
			else
			{
				b--;
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		//to print index of 2 elements whose sum was target element and given array was [3,6,13,15] and target was 9. 
		//Input = [3,6,13,15]
		//Output = [0,1]...indices of sum of numbers(3 + 6 = 9)
		
		int[] arr = {3,6,13,15,9,1};
		int a =0;
		int b = 0;
		
		//creating a new obj from ArrayList class as plain array doesnot have 'indexof' method
		//which will return index of an item from the array
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		//List<int[]> arrlist2 = Arrays.asList(arr);
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==9)
				{
					System.out.println("value found");
					//a = arr[i];
					arrlist.add(i);
					
					arrlist.add(j);
					System.out.println(arrlist.indexOf(j));
					//b = arr[j];
					continue;
					//break;
				}
			}
		}
		//System.out.println(a);
		//arrlist.indexOf(arrlist);
		//System.out.println(arr[a]);
		//System.out.println(b);
		
		
		//2nd method
		
		indexOfsum(arr1, 9);
		
		
		
		//chcking pallindrone num
		pallindrome_number(454);
	}

}
