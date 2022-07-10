package assignment;

public class childclasss extends parentclass{
int c= 30;
public void demo() {
	System.out.println("i am child class property");
}
public void test1() {//overriding property of parent 
	System.out.println("hello every one");
}
public static void main(String[] args) {
	childclasss obj=new childclasss();
	parentclass obj2= new parentclass();
	obj.test1();//property of parentclassis called with child classdue to inheritance
	obj2.test1();
	
	
}
}

