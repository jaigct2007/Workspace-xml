package com.reversestring;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Jayakumar hihihihihihhihiihhih";
StringBuilder build=new StringBuilder(s);
System.out.println(s.length());
int m=s.length()-1;
for (int i = m; i >=0; --i) {
	System.out.println(build.charAt(i));
	
}
	}

}
