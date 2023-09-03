import java.util.*;
//array of objects and inheritance
class rectangle1
{
	private double length;
	private double breadth;
	//constructor
	public rectangle1()
	{
		this.length=0;
		this.breadth=0;
	}
	//parameterized constructor
	public rectangle1(double l,double b)
	{
		this.length=l;
		this.breadth=b;
	}
	
	public void area() {
		System.out.println("AREA="+length*breadth);
	}
	public void perimeter() {
		System.out.println("PERIMETER="+2*(length+breadth));
	}
}
class square extends rectangle1
{
	private double side;
	public square()
	{
		this.side=0;
	}
	public square(double x)
	{
		super(x,x);
	}

	
}
public class inheritance {

	public static void main(String[] args) {
		rectangle1 r=new rectangle1(5,8);
		r.area();
		r.perimeter();
		square s=new square(2);
		s.area();
		s.perimeter();
		square sq[]=new square[10];
		double k=6;
		for (int i=0;i<10;i++,k++)
		{
			sq[i]=new square(k);
		}
		for(int j=0;j<10;j++)
		{
			sq[j].area();
			sq[j].perimeter();
			
		}
		


	}

}
