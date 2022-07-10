package advance;
import java.lang.String;
public class Reversenum {
public static void main(String[] args) {
	int num=123;
	int temp=num;
	while (temp!=0);
	{
		int rem= temp%10;
		System.out.print(rem);
		temp=temp/10;
	}
}
}
