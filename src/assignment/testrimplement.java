package assignment;

public interface testrimplement {
	int a=30; //by default static final public
	
	public void demo();
	void demo1();//by default public
	
	public static void demo3() {//we can write a completemethod in interface
		System.out.println("hello");
	}
	public static void main(String[] args, int b) {
		b=40;
		System.out.println(test.class);//variable are by default static
	}
	}