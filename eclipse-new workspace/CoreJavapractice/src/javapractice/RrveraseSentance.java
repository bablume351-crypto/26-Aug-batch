package javapractice;

import java.util.Scanner;

public class RrveraseSentance {
	
public void print(String inp) 
{
String []sen = inp.split("");
String out="";
for (int i=sen.length-1;i>=0;i--)
{out=out+sen[i];}
System.out.println(out);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RrveraseSentance ob=new RrveraseSentance();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("pls enter input");
	    String name = sc.nextLine();
	    ob.print(name);
	}
}
