package fibonacci;

import java.util.Scanner;

class fiboret1 {
public int fiboo(int n){
    int fib1=0;
    int fib2=1;
    int fib3 = 0;
    for(int i=0;i<=n;i++) {
      fib3=fib1+fib2;
     
      fib2=fib1;
      fib1=fib3;
    }
    return fib3;
}
class fiboret{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	  System.out.println("n="+n);
   fiboret1 f=new fiboret1();
   f.fiboo(n);
	System.out.println(n+" ");
}
}
}