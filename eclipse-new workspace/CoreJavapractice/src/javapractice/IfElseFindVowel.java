package javapractice;
import java.util.Scanner;

public class IfElseFindVowel {
	public void findvow(char ch) {
		
		 
	if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
       || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		System.out.println(ch+ " is a vowel ");
		}
	 else {
         System.out.println(ch + " is a Consonant");}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElseFindVowel ob=new IfElseFindVowel();
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls enter a character");
		char ch=sc.next().charAt(0);
		ob.findvow(ch);
	}
	

}
