/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception 

    {

        
          String str1="cde";
 
                  String str2="abc";
        
                  int count1[]=new int[26];
     
                  int count2[]=new int[26];
        
      
           for(int i=0;i<str1.length()-1;i++)
    
             count1[str1.charAt(i)-'a']++;
        
      
         for(int i=0;i<str2.length()-1;i++)
      
         count2[str2.charAt(i)-'a']++;
        
      
  int res=0;
      
  for(int i=0;i<26;i++)
    
    res=res+Math.abs(count1[i]-count2[i]);
   
     System.out.print(res);

 
   }


}
