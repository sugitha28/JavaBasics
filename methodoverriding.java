import java.util.*;
class TV
{
	public void on()
	{
		System.out.println("TV is switched on");
	}
	public void off()
	{
		System.out.println("TV is switched off");
	}
	public void antenna()
	{
		System.out.println("antenna is connected");
	}
	
}
class smartTV extends TV
{
	public void on()
	{
		System.out.println("smartTV is switched on");
	}
	public void off()
	{
		System.out.println("smartTV is switched off");
	}
	public void internet()
	{
		System.out.println("Internet is switched on");
	}
}
public class methodoverriding {

	public static void main(String[] args) {
		/*
		smartTV t=new smartTV();
		t.on();
		t.off();
		TV t=new TV();
		t.on();
		t.off();
		 */
		TV t=new smartTV();
		t.on();
		t.off();
		//t.internet();
		//cannot access the methods of a sub class using a super class reference
		//only overwritten methods can be accessed
		smartTV y=new smartTV();
		y.antenna();
	}

}
