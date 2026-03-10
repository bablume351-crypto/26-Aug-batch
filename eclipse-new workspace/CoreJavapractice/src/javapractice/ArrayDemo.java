package javapractice;

public class ArrayDemo {
	public void PrintDEMO() {
		int num[]= {2,3,4,5,6,7,8,9};
		int out=0;
		for(int i=0;i<=7; i++) {
			
			out=num[i]+out;
			System.out.println(out);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo ob	=new ArrayDemo();
		ob.PrintDEMO();
	}

}
