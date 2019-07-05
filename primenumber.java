class TestClass {
   
 public static void main(String args[] ) throws Exception 
  
  {
      for(int i=2;i<9;i++)
  
 
   {
     
     int temp=0;
        
  for(int j=2;j<i-1;j++)
  
      
  {
              if(i%2==0)
    
  
        {

                  temp=temp+1;

     
         }
    
      }
    
      if(temp==0)
    
      {
   
           System.out.print(i+" ");
  
        }
  
    }
     

        

  
  }

}