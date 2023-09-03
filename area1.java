import java.util.*;
public class area1 {

	public static void main(String[] args) {
		float s1,s2,s3,area;
		double OA;
		Scanner stc=new Scanner(System.in);
		System.out.println("Enter the Three of the triangle");
		System.out.println("Enter the S1 of the triangle");
		s1=stc.nextFloat();
		System.out.println("Enter the S2 of the triangle");
		s2=stc.nextFloat();
		System.out.println("Enter the S3 of the triangle");
		s3=stc.nextFloat();
		area=0.5f*(s1+s2+s3);
		OA=Math.sqrt(area*(area-s1)*(area-s2)*(area-s3));
		System.out.println("THE AREA OF THE TRIANGLE IS= "+OA);
		
		stc.close();
		

		
		
		

	}

}
