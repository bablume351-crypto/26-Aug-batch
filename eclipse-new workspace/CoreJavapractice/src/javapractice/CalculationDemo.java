package javapractice;

public class CalculationDemo {
public void add() {
	int a=50;
	int b=40;
	int c=a+b;
	System.out.println("This is add value " + c);
}

public void mup() {
	int p=80;
	int q=20;
	int s=p*q;
	System.out.println("This is Multiplication  value " + s);
}

public void sub() {
	int x=80;
	int y=20;
	int z=x-y;
	System.out.println("This is Sub value " + z);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationDemo ob=new CalculationDemo();
		
		ob.add();
		ob.mup();
		ob.sub();

	}

}
