package javapractice;

public class ReturnType {

	public int adddemo(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnType ob =new ReturnType();
		int re=ob.adddemo(10, 30);
		int out=re+10;
		System.out.println(out);
	}

}
