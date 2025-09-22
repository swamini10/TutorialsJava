package demo;
public class String_reverse {
 public static void main(String[] args) {
		  String str = "Swamini";
	    char[] charctorOfstring =str.toCharArray();    
		  for (int i = str.length() - 1; i >= 0; i--)
			  System.out.print(charctorOfstring[i]);
	}
 //using string method 
 	//	System.out.println(new StringBuilder(str).reverse());
   	
}

