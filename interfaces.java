interface member
{
	public void callback();
}
class store
{
	member mem[]=new member[30];
	int count=0;
	void register(member m)
	{
		mem[count++]=m;
	}
	void invite()
	{
		for(int i=0;i<30;i++)
		{
			mem[i].callback();
		}
	}
	
}
class customer implements member
{
	String name;
	public customer(String n)
	{
		this.name=n;
	}
	public void callback()
	{
		System.out.println("OKAY I WILL VISIT THE STORE "+name);
	}
}
public class interfaces {
	
	public static void main(String[] args) {
		store s=new store();
		customer c=new customer("sugitha");
		customer c1=new customer("taufeeq");
		s.register(c);
		s.register(c1);
		s.invite();

	}

}
