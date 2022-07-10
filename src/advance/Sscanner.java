 package advance;

import java.util.Scanner;

public class Sscanner {
@SuppressWarnings("resource")
public static void main(String args[]){ 
	Scanner st = new Scanner(System.in);
	System.out.println("enter your no.");
	int i,m=0,flag=0; 
	int a=st.nextInt();
	System.out.println(a);
	int n1=3
			;//it is the number to be checked    
  m=n1/2;      
  if(n1==0||n1==1){  
   System.out.println(n1+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n1%i==0){      
     System.out.println(n1+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n1+" is prime number"); } 
}}}
