package Core;

import java.util.Scanner;

public class whileTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		
		a[0]=43;
		a[1]=32;
		a[2]=10;
		a[3]=37;
		a[4]=40;
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("Enter the value of the flag");
			int id = sc.nextInt();
			try {
				System.out.println("Welcome to the nested try and catch");
				
				try {
					System.out.println(a[id]);
					flag=false;
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("welcome to the catch block of nested try");
					System.out.println("this is array index out of bounds exception");
					System.out.println("This is level 2 of catch");
				}
			}
			catch(Exception e) {
				System.out.println("This is the last catch block");
			}
		}
		System.out.println("This is the end of the program");

	}

}
