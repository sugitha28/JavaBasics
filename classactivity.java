class product
{
	private String productId;
	private String  name;
	private int price;
	private int qty;
	public product(String pId,String n,int p,int q)
	{
		productId=pId;
		name=n;
		price=p;
		qty=q;
		toString();
	}
	public String getproductId()
	{
		return productId;
	}
	public String getname()
	{
		return name;
	}
	public void setprice(int p)
	{
		price=p;
	}
	public void setqty(int q)
	{
		qty=q;
	}
	public String toString()
	{
		return("\n"+productId+"\n"+name+"\n"+price+" \n"+qty);
	}
}
public class classactivity {

	public static void main(String[] args) {
		product p[]=new product[4];
		p[0]=new product("1","soap",56,2);
		p[1]=new product("2","candy",6,5);
		p[2]=new product("3","sugar",26,4);
		p[3]=new product("4","surfXL",51,3);
		for(product it:p)
		{
			System.out.println(it);
		}
		
	}

}
