
class outer
{
	int x=90;
	static class inner
	{
		void display()
		{
			int y=88;
			System.out.println("y="+y);
		}
		
	}
	
}
public class innerclass {

	public static void main(String[] args) {
		//can access static inner class members directly from main outer class reference 
		outer.inner i=new outer.inner();
		i.display();
	}

}
