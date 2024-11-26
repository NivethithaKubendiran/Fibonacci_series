package fibonacci;

import java.util.Scanner;

public class fibo1 { 
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
    System.out.println("n="+n);
    int fib1=0;
    int fib2=1;
    int fib3 = 0;
    for(int i=0;i<=n;i++) {
      fib3=fib1+fib2;
      System.out.print(fib1+" ");
      fib1=fib2;
      fib2=fib3;
      
    }
   
	}
	
}
