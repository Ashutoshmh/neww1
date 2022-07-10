package assignment;

public class classb {
int b=30;
public void test () {
	int c=40;
	System.out.println(this.b);
	System.out.println(c);

}
public static void main(String[] args) {
	classb obj=new classb();
	System.out.println(obj.b);

	obj.test();
	
}

}
