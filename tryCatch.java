package Core;
public class tryCatch {

	public static void main(String[] args) {
		int a =10;
		int b= 20;
		int c =a+b;
		
		System.out.println(c);
		
		try {
			int a1 =20;
			int b1 = 30;
			int c1 = b1-a1;
			
			System.out.println(c1);
			int d = a1/0;
			System.out.println(d);
			System.out.println("navya");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Now the program comes to this catch block");
			System.out.println("this d will not be printed in try block as it gives the exception");
			System.out.println("This is the try and catch block program");
		}

	}

}
