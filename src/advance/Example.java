package advance;

public class Example {
	public static void main(String[] args) {
		String str="I am Ashutosh Mhaswade";//ash repated alphabets
		int count;
		char[]cArr=str.toCharArray();
		for (int i =1;i<str.length();i++)
		{
			count=1;
			for(int j=i+1;j<str.length();j++)    
			{
			if (cArr[i]==cArr[j]&& cArr[i]!=' ')
			{
				count++;
				cArr[j]=0;
				
			}
			}
				
				
				
				
				if ((count>1)&&cArr[i]!=0)
			{
				System.out.print  (cArr[i]);
			}}}}
