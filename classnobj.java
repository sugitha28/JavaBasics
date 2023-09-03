import java.util.*;
class rectangle{
	public double length;
	public double breadth;
	public double area() {
		return length*breadth;
	}
	
}
class cylinder{
	private double radius;
	private double height;
	//3 constructors
	public cylinder()
	{
		radius=0;
		height=0;
		
	}
	public cylinder(double r)
	{
		setrad(r);
		height=1;
		
	}
	public cylinder(double r,double h)
	{
		setrad(r);
		setheight(h);
	}
	//data hiding
	public void setrad(double r)
	{
		if(r>0)
		{
			radius=r;
		}
		else
		{
			radius=0;
		}
		
	}
	public double getrad()
	{
		return radius;
	}
	public void setheight(double h)
	{
		if (h>0)
		{
			height=h;
		}
		else
		{
			height=0;
		}
	}
	public double getheight()
	{
		return height;
	}
	
	
	public double CSA()
	{
		return 2*Math.PI*radius*height;
	}
	public double TSA()
	{
		return 2*Math.PI*radius*(radius+height);
	}
	public double volume()
	{
		return Math.PI*(radius*radius)*height;
	}
}
public class classnobj {

	public static void main(String[] args) {
		cylinder c=new cylinder();
		System.out.println(c.getrad());
		System.out.println(c.getheight());
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS VALUE");
		double x=s.nextDouble();
		c.setrad(x);
		System.out.println("ENTER THE HEIGHT VALUE");
		double y=s.nextDouble();
        c.setheight(y);
		System.out.printf("CYLINDER SURFACE AREA= %.2f \n",c.CSA());
		System.out.printf("TOTAL SURFACE AREA=%.2f \n",c.TSA());
		System.out.printf("VOLUME=%.2f \n",c.volume());
		System.out.println(c.getrad());
		System.out.println(c.getheight());
		s.close();
	}

}
