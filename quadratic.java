import java.util.*;
public class quadratic {

	public static void main(String[] args) {
		float a,b,c;
		double sqt,r1,r2;
		System.out.println("ENTER THE CO-EFFICIENT a,b,c RESPECTIVELY");
		Scanner stc=new Scanner(System.in);
		a=stc.nextFloat();
		b=stc.nextFloat();
		c=stc.nextFloat();
		sqt=Math.sqrt((b*b)-(4*a*c));
		r1=(-b+sqt)/(2*a);
		r2=(-b-sqt)/(2*a);
		System.out.println("ROOT 1= "+r1);
		System.out.println("ROOT 2="+r2);
		stc.close();
			
		
		
		
		
		
		
		

	}

}
