
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Jaya,suba,siva";
		String b="Suba";
		System.out.println(a+b);
		String [] s=a.split(",");
		System.out.println(s.length);
		System.out.println(s[0]);

		String s1="+";
		String s2="/";
		if(s1==s2)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("not same");
		}
	}

}
