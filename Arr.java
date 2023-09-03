import java.util.*;
public class Arr {
	public void create(){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int size=sc.nextInt();
	    int[] a=new int[size];
	    System.out.println("Now Enter the elements of the array");
	    for(int i=0;i<size;i++)
	    {
	        System.out.println("Now Enter the element of the array");
	        a[i]=sc.nextInt();
	    }
	    System.out.println("Array Elements Are:");
	    for(int val:a)
	    {
	    	System.out.println(val+" ");
	    }
	    sc.close();
	}	
	public static void main(String[] args) {
		Arr ac=new Arr();
		ac.create();	
	}
}
