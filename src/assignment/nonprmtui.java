package assignment;

public class nonprmtui {
public static void main(String[] args) {
	String a="ashutosh";
	String b=new String ("akluj");
	System.out.println(a.charAt(3));//to print character at particular index
	int len =a.length();//gives length particular string
	System.out.println(len);
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	boolean result=a.equals(b);
	System.out.println(result);
	boolean result1=a.equalsIgnoreCase(b);
	System.out.println(result1);
	System.out.println(a);
	System.out.println(a.concat(" dash"));
	String c= a.toLowerCase();
	System.out.println(a);
	boolean v= a.contains("lo");
	System.out.println(c);
	System.out.println(v);
	System.out.println(a.substring(6));
	
	
}
}
