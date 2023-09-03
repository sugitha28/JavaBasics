import java.util.*;
import java.lang.Math.*;
public class forexercise {

	public static void main(String[] args) {
		

		/*for(int i=1;i<=5;i++)
		{
			for (int j=1;j>i;j++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();	
		}*/
		
		/*
		 *for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=5-i+1;j++)
			{
				System.out.format("%2d ",j);
				
			}
			System.out.println();
			
		} 
		 */
		
		
		/*
		 * int c=0;
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
			    if(j<=i)
				{
			    	c=c+1;
					System.out.format("%02d ",c);
				}
			}
			System.out.println();
			
		}
		 */
		
		/*
		 * for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
			    if(j<=i)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
			
		}
		
		 */
		
		
		/*
		 * int sum=0;
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				sum=sum+1;
				System.out.format("%02d ",sum);
			}
			System.out.println();
		}
		
		 * 
		 */
		
		 //fibonicci series
	    int n=10;
		int sum=0;
		int n1=0;
		int n2=1;
		System.out.print(n1+","+n2);
		for(int i=1;i<=n-2;i++)
		{
			sum=n1+n2;
			System.out.print(","+sum);
			n1=n2;
			n2=sum;	
		}
		 */
		
		
		/*
		 * geometric series
		 * int s=5;
		int d=2;
		int n=10;
		for(int i=1;i<=n;i++)
		{
			System.out.print(s+" ");
			s=s*d;	
		}
		
		 */
		
		/*
		 *arithmetic series
		int s=7;
		int d=2;
		int n=10;
		for(int i=1;i<=n;i++)
		{
			System.out.print(s+" ");
			s=s+d;	
		}
		 */
		
		
		/*
		 * int n=90006540;
		String s=String.valueOf(n);
		String rev="";
		//reversing  a string
		for (int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		//printing the characters of the reversed string
		char c;
		for(int j=rev.length()-1;j>=0;j--)
		{
			c=rev.charAt(j);
			switch(c)
			{
			case'0':
				System.out.print("zero ");
				break;
			case'1':
				System.out.print("one ");
				break;
			case'2':
				System.out.print("two ");
				break;
			case'3':
				System.out.print("three ");
				break;
			case'4':
				System.out.print("four ");
				break;
			case'5':
				System.out.print("five ");
				break;
			case'6':
				System.out.print("six ");
				break;
			case'7':
				System.out.print("seven ");
				break;
			case'8':
				System.out.print("eight ");
				break;
			case'9':
				System.out.print("nine ");
				break;
			default:
				System.out.print("ending____");
			}
			
		}
		
		 */
		
		
		/*
		 * palindrome or not
		 * int n=90709;
		int m;
		int rev=0;
		int i=n;
		while(i>0)
		{
			m=i%10;
			rev=(rev*10)+m;
			i=i/10;
		}
		if(rev==n)
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		 */
		
		
		/*
		 * reversing the digit
		 * int n=7689;
		int m;
		int rev=0;
		for(int i=n;i>0;)
		{
			m=i%10;
			i=i/10;
			rev=rev*10+m;
		} 
		System.out.println(rev);
		 */
		
		/*
		 * amstrong number or not
		 * int n=153;
		int m;
		double sum=0;
		for(int i=n;i>0;)
		{
			m=i%10;
			sum=sum+Math.pow(m,3);
			i=i/10;
		} 
		if(sum==n)
		{
			System.out.println("is a amstrong number");
		}
		else
		{
			System.out.println("not a amstrong number");
		}
		 */
		
		
		/*
		 * sum of digits
		 *int n=7689;
		int m;
		int sum=0;
		for(int i=n;i>0;)
		{
			m=i%10;
			sum=sum+m;
			i=i/10;
			
		} 
		System.out.println("sum="+sum); 
		 */
		
		
		/*
		 * displaying the digits of a number
		 *int n=7689;
		int m;
		for(int i=n;i>0;)
		{
			m=i%10;
			System.out.println(m);
			i=i/10;
		} 
		 */
		
		
		
		/*
		 * factorial of a number
		 * int n=5;
		int m=1;
		for(int i=n;i>=1;i--)
		{
			m=m*i;
		}
		System.out.println("FACTORIAL="+m);
		 */
		
		/*
		 * sum a number
		 *int n=4;
		int m=0;
		for(int i=1;i<=n;i++)
		{
			m=m+i;
		}
		System.out.println("SUM="+m); 
		 */
		/*
		 * multiplication table
		 * int n=5;
		int m=10;
		int i;
		for(i=1;i<=m;i++)
		{
			System.out.println("5*"+i+"="+i*n);
		}
		 */
	}

}
