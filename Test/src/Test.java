import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double value=.012323000;
double pSum= value+value+value;
System.out.println("Sum of primitives" +pSum);

String strValue=Double.toString(value);
BigDecimal dec= new BigDecimal(strValue);
BigDecimal bSum=dec.add(dec).add(dec);
System.out.println(bSum.toString());
System.out.println(dec.toString());

int val=6;

boolean b1=false;
boolean b2=!b1;
System.out.println(b2);
if(!b2)
{
	System.out.println("here ur output");
}
	String s1="6556";
	System.out.println(s1.toUpperCase());
	
	int m2=10;
	int m3=3;
	int m4=m2%m3;
	System.out.println(m4);
	++m2;
	System.out.println(++m2/m3);
	Date d=new Date();
	SimpleDateFormat a=new SimpleDateFormat("YYYY/MM/DD");
	System.out.println(a.format(d));
	System.out.println(d);
	
	}
	

	
	
			
 
	
}
