package javapractice;

import java.util.Scanner;

public class ReverseArrary {
	public void print(String name) {
		char [] ch=name.toCharArray();
		String out="";
		for(int i=ch.length-1; i>=0; i--) 
		{out = out+ch[i];}	
		System.out.println(out);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArrary ob=new ReverseArrary ();
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter input");
	     String name =sc.next();
	     ob.print(name);
	}

}
