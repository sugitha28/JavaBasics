
public class stringexercie {

	public static void main(String[] args) {
		String st="sugithasugumar28@yahoo.co.in";
		int v=st.indexOf("@");
		String un=st.substring(0,v);
		String dn=st.substring(++v);
		System.out.println("USER NAME = "+un);
		System.out.println("DOMAIN NAME = "+dn);
		if (st.endsWith("@gmail.com")==true)
		{
			System.out.println("IT IS A GMAIL ACCOUNT");
		}
		else
		{
			System.out.println("NOT A GMAIL ACCOUNT");
		}
		//binary
		String s="000100";
		System.out.println(s.matches("[0|1]*"));
		//hexadecimal
		String t="451AE";
		System.out.println(t.matches("[0-9A-F]+"));
		//date format
		String q="02/05/2002";
		System.out.println(q.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
		//to remove all special characters from a string
		String r="whdjks^%$dhj$#@A23";
		String n=r.replaceAll("\\W*","");
		System.out.println(n);
		System.out.println(r.replaceAll("[^a-zA-Z0-9]",""));
		//removing white spaces in a string
		String w="hdks kdhsbd dsdskdb sdjhb  sbds";
		System.out.println(w.replaceAll("\\s*",""));
		//finding no of words in a string
		String x="  the   apple is not    that goo in taste  ";
		//System.out.println(x.replaceAll("\\s+",""));
		//System.out.println(x.trim());
		String z=x.replaceAll("\\s+"," ").trim();
		String arr[]=z.split("\\s");
		System.out.println("NO OF WORDS IN THE STRING="+arr.length);
	}
}
