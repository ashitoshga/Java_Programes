package strings_programs;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String str = "Ashitosh";		 
		//op-find dup char--ss
		  String str4 = "GENERATED";	        
		  //find longest substring --op should be longest sybstring--RAT
		  
				  
	        int a = str.length();
	        //System.out.println(a);
	        String str2 ="";
	        String str5="";
	        for(int i=0; i<str.length(); i++)
	        {
	            for(int j=i+1; j<str.length(); j++)
	            {
	                if(str.charAt(i)==str.charAt(j))
	                {                    
	                	 str5 = str2+str4.substring(i, j);
	                	
	                	//str2 = str2 + str.charAt(j);
	                    //break;
	                }
	                else
	                {
	                	
	                }
	                
	            }
	        }
	        System.out.println(str5);

	}

}
