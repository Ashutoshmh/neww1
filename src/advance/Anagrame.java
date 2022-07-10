package advance;

import java.util.Arrays;

public class Anagrame {
	public static void main(String[] args) {
		String str1="Heart";
		String str2 ="Earth";
		boolean flag =false;
		if (str1.length()==str2.length())
		{
			char[]cArr1=str1.toLowerCase().toCharArray();
			char[]cArr2=str2.toLowerCase().toCharArray();
			Arrays.sort(cArr1);

			Arrays.sort(cArr2);
			flag = Arrays.equals(cArr1,cArr2);
			if(flag)
				System.out.println("Given string are anagram");
		}
		else 
			System.out.println("Given String Are not Anagrame");

	}
}

