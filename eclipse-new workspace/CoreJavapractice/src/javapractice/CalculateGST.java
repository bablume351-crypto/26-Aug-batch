package javapractice;
import java.util.Scanner;
public class CalculateGST {
public void Bill(int amount) {
	
	float gst=(amount*18)/100;
	float totalprice=amount+gst;
	System.out.println(" your is product price "+amount);
	System.out.println("Your gst Price "+ gst);
	System.out.println("your total price with GST "+ totalprice);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter input");
		int P_price =sc.nextInt();
		CalculateGST ob	=new CalculateGST();
		ob.Bill(P_price);
	}

}
