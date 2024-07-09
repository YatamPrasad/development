package entity.pennat.com;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String msg = sc.nextLine();
		System.out.println(str+" "+msg);

	}

}
