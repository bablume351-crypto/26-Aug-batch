package javapractice;

import java.util.Scanner;

    public class Reverse {
	public void print(String inp) {
		char []ch=inp.toCharArray();   // j,a,v,a
		String out="";
		for(int i=ch.length-1; i>=0;i--) {
		out=out+ch[i];	
		}
		System.out.println(out );
	}
	public static void main(String[] args) {
		Reverse	ob=new Reverse();
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter input");
		String name=sc.next();
	ob.print(name);	
	
	}
}
