import java.util.*;
public class regexp {

	public static void main(String[] args) {
		/*
		 * String st="sugithaSugumarsundar";
		String st1="Sugithasugumarsundar";
		System.out.println(st.matches("\\D"));
		//returns the length of a string
		System.out.println(st.length());
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		//gives a substring from the given starting index
		System.out.println(st.substring(3));
		//gives a substring from the given starting and ending index
		System.out.println(st.substring(2,6));
		System.out.println(st.startsWith("Mrs."));
		System.out.println(st.endsWith(".com"));
		System.out.println(st.replace("a","i"));
		//returns character at specified index
		System.out.println(st.charAt(4));
		//searches for a particular character from the starting index
		System.out.println(st.indexOf("s"));
		//searches for a particular character from the given index
		System.out.println(st.indexOf("s",4));		
		//searches for a particular character from the given last index
		System.out.println(st.lastIndexOf("s",13));
		//checks whether the 2 values of a sting are equal
		System.out.println(st.equals(st1));
		//checks whether the 2 values of a sting are equal by ignoring the case
		System.out.println(st.equalsIgnoreCase(st1));
		/*Compares the first value of 2 string 
		 * if st>st1 returns +ve num
		 * if st<st1 returns -ve num
		 * if st=st1 returns 0
		 */
		/*
		System.out.println(st.compareTo(st1));
		//converts any float,int,double to a string
		String st2=String.valueOf(34);
		System.out.println(st2+st); 
		*/
		
		
		/*
		 * //FINDING THE RADIX OF A STRING
		Scanner st=new Scanner(System.in);
		System.out.println("enter the string");
		String i=st.nextLine();
		if(i.matches("[0-1]+")==true)
		{
			System.out.println("Its is a binary");
		}
		else if(i.matches("[0-7]+")==true)
		{
			System.out.println("It is a octal");
			
		}
		else if(i.matches("[0-9]+")==true)
		{
			System.out.println("It is a decimanl");
			
		}
		else if(i.matches("[0-9A-F]+")==true)
		{
			System.out.println("It is a hexadecimal");
		}
		else
		{
			System.out.println("It doesnt have a radix");
		}
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the URL");
		String st=s.nextLine();
		Integer i=st.indexOf(":");
		String domain=st.substring(0,i);
		System.out.println(domain);
		Integer j=st.lastIndexOf(".");
		String or=st.substring(++j);
		System.out.println(or);


		
		
	}
}


