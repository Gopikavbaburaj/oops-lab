import java.util.*;
import java.io.*;
import java.util.Scanner;
class NegValueException extends Exception
{
 void showError()
 {
  System.out.println("Sorry !!!, You entered a negative number");
 }
}

class Calcs
{
    void Average(double num,int n)
    {
    double avg;
    avg=num/n;
    System.out.println("Average= "+avg); 
    }
   }

public class Main
{
  public static void main(String args[])
  {
    int n,i;
    double sum=0;
    int low=99999;
    Calcs ob=new Calcs();
    
    Scanner sc1 = new Scanner(System.in); 
    System.out.println("Enter the limit:");
    n = sc1.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the numbers:");
    for(i=0;i<n;i++)
    {
    arr[i]= sc1.nextInt();
    
    try
    {
     if(arr[i]<0)
     {
     sum=0;
     throw new NegValueException();
     }
     else
     {
     sum=sum+arr[i];
     }
    }
    catch (NegValueException e)
    {
     e.showError();
    }
    }
    ob.Average(sum,n);
     
   for(i=0;i<n;i++)
    {
    if(arr[i]<low)
    {
    low=arr[i];
    }
    }
    System.out.println("Lowest number is :"+low);
    int high=0;
   for(i=0;i<n;i++)
    {
    if(arr[i]>high)
    {
    high=arr[i];
    }
    }
    System.out.println("Highest number is :"+high);
    
   
    
  }
}
  
