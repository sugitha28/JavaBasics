import java.util.*;
public class area {

	public static void main(String[] args) {
		Scanner stc=new Scanner(System.in);
		float area,length,breadth;
		System.out.println("ENTER THE LENGTH AND THE BREADTH RESPECTIVELY");
		length=stc.nextFloat();
		breadth=stc.nextFloat();
		area=(int)(length*breadth*0.5);
		System.out.println("AREA OF THE RECTANGLE = "+area);
		
		stc.close();
		
		
		

	}

	
}
