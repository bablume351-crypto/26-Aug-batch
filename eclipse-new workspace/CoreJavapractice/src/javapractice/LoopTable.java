package javapractice;

	import java.util.Scanner;

	public class LoopTable {
	    public void print(int table) {
	     
	    System.out.println("JAI shri krishana");
	    for(int i=1;i<=10;i++)
	    {
	    	System.out.println(i*table);}  
	    }
	public static void main(String[] args) {
		LoopTable ob=new LoopTable();
		 Scanner sc=new Scanner(System.in);
	     System.out.println("pls inter input");
		 int  table =sc.nextInt();
	     ob.print(table);
	     
	}
	}
