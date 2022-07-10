package assignment;

public class cons {

cons (int a,String b){
	System.out.println("hello i am contructor");
}
public void test () {
	System.out.println("i am test");
}
 
public static void main(String[]arg) {
	
	 cons obj = new cons(5,"hello");
	 obj.test();
	 obj.test();
 	 obj.test();
 	 cons obj2 = new cons(5, "hiii");
 	 System.out.println(obj2);
 }
}
