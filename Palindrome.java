import java.util.*;
class Palindrome

  {

      public static void main(String[]args)

        {
         
     Scanner sc=new Scanner(System.in);
     System.out.println("Entered Number To Check Whether It Is Palindrome or Not");

      int N=sc.nextInt();

      int rev=0, rem;
        
      int i=N;

      while(i!=0)

     {

      rem=i%10;
       
      rev=(rev*10)+rem;

      i=i/10;
      
      }
         
         if(N==rev)
          System.out.println(+N+" is Palindrome Number");

         else
      
           System.out.println(+N+" is not a Palindrome Number");

                 }

     }
          
