package assignment;

public class Nonpremative45 {
public static void main(String[] args) {
	short a=10;
	int b=a;
	System.out.println(b);
	double d =b//implecite
		;
	System.out.println(d);
	double e= 10000.899;
	int i=(int )e;//explicite
	System.out.println(i);
	short s= (short)i;
	System.out.println(s);
}
}
