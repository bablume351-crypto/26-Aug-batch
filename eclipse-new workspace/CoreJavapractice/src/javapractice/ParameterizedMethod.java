package javapractice;
import java.util.Scanner;
public class ParameterizedMethod {
	public void Add(int a,int b) {
		
		int c=a+b;
		System.out.println("this is Add value " + c);
	}
public void Sub(int a,int b) {
		
		int c=a-b;
		System.out.println("this is Sub value " + c);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls enter input");
		int a=sc.nextInt();
		int b=sc.nextInt();		
		ParameterizedMethod  ob=new ParameterizedMethod ();
		ob.Add(a, b);
		ob.Sub(a, b);
	}

}
