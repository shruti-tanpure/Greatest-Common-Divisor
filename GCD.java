import java.util.Scanner;

public class GCD
{
    public static void main(String args[])
    {
        long a=0;
        long b=0;
        long c=0;    //acts as a temporary variable
        
        //input of the numbers
        Scanner sc = new Scanner(System.in);
        a=sc.nextLong();
        b=sc.nextLong();
        sc.close();
        
        //computing the GCD of a and b
        if(a>b){
		while(b>0 && a!=b)
		{   
		    c=a;
		    a=b%a;
		    b=c%b;      
		}
		if(b==0 || a==b)
		{
		    System.out.println(a);
		}
	}
	else if(b>a){
		while(a>0 && a!=b)
		{   
		    c=b;
		    b=a%b;
		    a=c%a;      
		}
		if(a==0 || a==b)
		{
		    System.out.println(b);
		}
	}
	else 
	        System.out.println(a);
        
    }
}
