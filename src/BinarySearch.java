import java.util.*;
public class BinarySearch
{
   
public static int loopBinarySearch(int[] arr, int value)
{
  int start = 0;
  int end = arr.length;
  int mid = 0;
  
  while (start <= end)
  {
     
      mid = (start + end)/2;
        if(value == arr[mid])
        {
       
           return mid;
           
        }
        else if(value < arr[mid])
        {
           end = mid-1;
     

        }
        else if(value > arr[mid])
        {
           start = mid + 1;
       

        }
     
  }
  return -1;
  
}
public static int recursiveBinarySearch(int [] arr, int start, int end, int value)
{
   int mid = 0;
  
      
  mid = (start + end)/2;
  if(start > end)
  {
     mid=-1;
  }
     else if(value == arr[mid])
      {
         return mid;
      }
      else if(value < arr[mid])
      {
         return recursiveBinarySearch(arr, start, mid-1, value);
      }
      else if(value > arr[mid])
      {
         return recursiveBinarySearch(arr, mid+1, end,value); 
      }
     
   return mid;
}
public static void main(String args[])
{
   Scanner scnr = new Scanner(System.in);
   System.out.print("How big is your array?");
   int size = scnr.nextInt();
   int [] a = new int[size];
   for(int i = 0; i < a.length; i++)
   {
      System.out.print("Enter your next int array in nondecreasing order:");
      a[i] = scnr.nextInt();
   }
   System.out.println("Here is your array: ");
   for(int i = 0; i < a.length; i++)
   {
      System.out.print(a[i] + " ");
   }
   System.out.println();
   boolean more = true;
   while(more)
   {
      System.out.print("Do you want to search for a value in your array? \nType in \"y\" please");
      String option = scnr.next();
      if("y".equals(option.toLowerCase()))
      {
         System.out.print("Enter a value to search for in your array: ");
         int value = scnr.nextInt();
         boolean valid = false;
         while(!valid)
         {
            System.out.println("Enter \"loop\" to run the loop version");
            System.out.println("Enter \"recursive\" to run the recursive version");
            String choice = scnr.next();
            if("loop".equals(choice.toLowerCase()))
            {
               System.out.println(loopBinarySearch(a,value));
               valid = true;
            }
            else if("recursive".equals(choice.toLowerCase()))
            {
               System.out.println(recursiveBinarySearch(a,0,a.length-1,value));
               valid = true;
            }
            else
            {
               System.out.println("ERROR: Please Try Again");
            }
         }
      }
      else
      {
         more = false; 
      }
   }
}
}
