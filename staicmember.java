
public class staicmember {
	int x=80;
	static int y=10;
	void show() {
		System.out.println(x+"___________"+y);
	}

	public static void main(String[] args) {
		staicmember st=new staicmember();
		st.show();
		st.x=90;
		st.y=200;
		staicmember st1=new staicmember();
		st1.show();
		
		

	}

}
