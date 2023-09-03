import java.util.*;
abstract class shape
{
	abstract public void perimeter();
	abstract public void area();
}
class circle extends shape
{
	private double radius;
	public circle(int r)
	{
		this.radius=r;
	}
	public void perimeter() {System.out.println("Perimeter of a circle="+2*Math.PI*radius);}
	public void area() {System.out.println("Area of a circle="+Math.PI*radius*radius);}
}
class retangle extends shape
{
	private double length;
	private double breadth;
	public  retangle(double l,double b)
	{
		this.length=l;
		this.breadth=b;
	}
	public void area() {System.out.println("Area of a rectangle="+length*breadth);}
	public void perimeter() {System.out.println("Perimeter of a rectangle="+2*(length+breadth));}
	
}
public class abstractclasses {

	public static void main(String[] args) {
		shape r=new retangle(3,6);
		shape c=new circle(6);
		r.perimeter();
		r.area();
		c.perimeter();
		c.area();
		
	}

}
