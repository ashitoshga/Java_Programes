package strings_programs;

import java.util.Arrays;
//import java.util.Collections;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;



public class Substring_in_array {
	//RemoteWebDriver dr;
	WebDriver drw;
	
	
    ///[] arr = {"flower", "flow", "flop"};
    //find the most common/longest substring from above string
    //op should be 'flo'
    //first sort the array alphabetically
    //take first item arr[0] and compare each char with the next item from the array arr[1]
    //if match is found then increase the counter and break if no match found
    //then use substring() which take 2 inputs, start of the string and end of the string
   
	//  String[] arr = {"flower", "flow", "flop"};
	public static String common_substring(String[] arr)
	{

         Arrays.sort(arr);
        String str1 = arr[0];  //first item from the array
        String str2 = arr[arr.length-1]; //last item from the array
        System.out.println(str1);
        System.out.println(str2);
        int index = 0;
        while(index<str1.length())
        {
            if(str1.charAt(index)==str2.charAt(index))
           {
               index++;
           }
           else
           {
               //index=0;
               break;
           }    
        }//while loop ends
         //return index==0?"":str1.substring(0, index);
        
        //above statement can be re-written as
        //boolean statement ? true result : false result;        
        if (index==0) {
            return "";
        } else {
        	return str1.substring(0, index);
        }
	}
	
	
	
	  //find common substring from the given String
	//String str = "String contains substring";
	   static public void substringextractor(){
		  String str = "String contains substring";
		  String str2 = "contains";
		  String str1="";
		  //OP verify that str2 is present in str or not
		  
		  	//Method-1 using direct method	
		  System.out.println(str.contains("contains"));
		  
		  //Method-2 using loops find starting and end char of substring 
		  //and check if it is present
		 
		//Method-2 using indexof method	
		  int res = str.indexOf(str2);
		  if(res==-1)
		  {
			  System.out.println(str1 +" " +  "String contains in parent");
		  }
		  else
		  {
			  System.out.println(str2+" " + "String does not present in parent");
		  }
		  
		  
		  
		  
//		  int startindx = str.indexOf("contains");
//		  System.out.println(startindx);
//		  int indx = 0;
//		  for(int i=0; i<str.length(); i++)
//			{
//			  for(int j=str1.indexOf(str2); j<str2.length(); j++)
//			  {
//				  if(str.charAt(i)==str2.charAt(j))
//				  {
//					   indx++;	
//					 System.out.println("Substring  found");
//					   break;
//					   
//				  	}
//				  }			
	
	//			}
		  //System.out.println(str1.substring(0, indx));
		 
		 /* while(indx<str.length())
		  {
			  System.out.println(str.charAt(indx));
			  System.out.println(str2.charAt(indx));
			  if(str.charAt(indx)==str2.charAt(indx))
			  {
				  indx++;				  
			  }
			  else
			  {
				  break;
			  }
		  }
		  if (indx==0) {
			  System.out.println("Substring not found");
	        } else {
	        	System.out.println(str1.substring(0, indx));
	        }*/
		}
		  
    
	//Finding common substring from the given array
	  public static void main(String []args){
		  String[] arr = {"flower", "flow", "flop"};
		  //common_substring(arr);
		  System.out.println("Common substring in the given string is" + " "+ "'"+ common_substring(arr)+ "'");
		  substringextractor();
     }	  
	  

}
