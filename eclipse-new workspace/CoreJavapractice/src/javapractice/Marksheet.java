package javapractice;
import java.util.Scanner;
public class Marksheet {
	public void printMarksheet(int hindi,int Math,int English,int Computer, int Science) {
	int	totalmarks=hindi+Math+English+Computer+Science;
	int per=(totalmarks*100)/500;
	System.out.println("your marks in hindi "+ hindi);
	System.out.println("your marks in Math "+ Math);	
	System.out.println("your marks in English "+ English);
	System.out.println("Your marks in Computer "+ Computer);
	System.out.println("Your marks in Science "+ Science);
	System.out.println("---------------------------------------");
	System.out.println("Your marks in totalmarks "+ totalmarks);
	System.out.println("Your marks in Percentage "+ per+"%");
	System.out.println("---------------------------------------");
	if (per<33) {
		System.out.println("you are fail");
	}
	else {System.out.println("you are pass");}
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marksheet ob=new Marksheet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls enter your Marks");
		int hindi=sc.nextInt();
		int Math=sc.nextInt();
		int English=sc.nextInt();
		int Computer=sc.nextInt();
		int Science=sc.nextInt();
		ob.printMarksheet(hindi, Math, English, Computer, Science);
	
}

}
