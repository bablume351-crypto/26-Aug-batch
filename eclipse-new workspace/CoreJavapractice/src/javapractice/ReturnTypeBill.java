package javapractice;
import java.util.Scanner;
public class ReturnTypeBill {
public float billre(int amount) {
float	gst=(amount*18)/100;
return gst;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter input");
		int amount=sc.nextInt();
		ReturnTypeBill ob	=new ReturnTypeBill();
float gst=ob.billre(amount);
float tatalPrice=gst+amount;
System.out.println("this is product price " +amount);
System.out.println("this is gst "+gst);
System.out.println("this is total price "+tatalPrice);
}
}
