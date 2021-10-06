import java.util.*;
import java.io.*;
import java.util.Scanner;
class Calc
{
    void check(int num)
    {
 	int sum=0;
	while(num!=0)
	{
	   int r=num%10;
	   if((r%2) != 0) 
	   { 
	     sum=sum+r;
	   } 
	   num=num/10;
	} 
        System.out.println("Sum of odd numbers is "+sum);
    }
}

public class oddSum
{
    public static void main(String args[ ])
    {
      int num;
	Scanner sc1 = new Scanner(System.in); 
	System.out.println("Enter a number:");
	num = sc1.nextInt();
        Calc ob =new Calc();
        ob.check(num);
    }
}  
	 
