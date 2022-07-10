package assignment;

public interface test122 {
public  void demo();
//no need of abstrcat keyword 
// public void demo2 (){//cannot complete static method

public static  void demo3() {//we can write a complete static method in iterface
	System.out.println("hello");
}
//public static void demo4();//connot write a incomplte static method
public static void main(String[] args) {
	// test obj= new test (); cannot crete object of interface becuse no contructor present}
}
}
