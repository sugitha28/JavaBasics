import java.util.*;
public class methods {
	static int reverse(int n)
	{
		int m;
		int sum=0;
		while(n!=0)
		{
			m=n%10;
			sum=(sum*10)+m;
			n=n/10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int i,j;
		int n=7893;
		System.out.println(reverse(n));
		int a[]= {1,2,3,45,5};
		for(i=0,j=a.length-1;i<a.length;i++,j--)
		{
			a[i]=a[j];
			
		}
	}

}
