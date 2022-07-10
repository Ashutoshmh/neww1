package assignment;

public class test20cos {

test20cos (){
	System.out.println("hello i am contructor");
}
public void test () {
	System.out.println("i am test");
}
 
public static void main(String[]arg) {
	 test20cos obj = new test20cos();
	 obj.test();
	 obj.test();
 	 obj.test();
 	 test20cos obj2 = new test20cos();
 	 System.out.println(obj2);
 }
}