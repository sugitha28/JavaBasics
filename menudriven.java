import java.util.*;
public class menudriven {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF A");
		int a=st.nextInt();
		System.out.println("ENTER THE VALUE OF B");
		int b=st.nextInt();
		st.nextLine();
		System.out.println("ENTER ANY OPTION");
		System.out.println("1.ADD");
		System.out.println("2.SUB");
		System.out.println("3.DIV");
		System.out.println("3.MUL");
		String ch=st.nextLine();
		switch(ch)
		{
		case"ADD":
			int c=a+b;
			System.out.println("A=B="+c);
			break;
		case"SUB":
			int d=a-b;
			System.out.println("A=B="+d);
			break;
		case"MUL":
			int e=a*b;
			System.out.println("A*B="+e);
			break;
		case"DIV":
			int f=a/b;
			System.out.println("A/B="+f);
			break;
		default:
			System.out.println("PLEASE ENTER A VALID OPTION");
		}
		


	}

}
