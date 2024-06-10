package Core;

public class exceptionhandlingTryCtach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Navya";
		System.out.println(name);
		int age = 18;
		System.out.println(age);
		System.out.println("Program continues");
		//THIS WILL COME IN TRY BLOCK AS IT IS GIVING EXCEPTION. SO IN TRY BLOCK WE SHOULD PLACE AN EXCEPTION
		try {
		int c =20/0;
		System.out.println(c);
		System.out.println("This part will not going to be executed");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("integer c will giving an exception so that will ot rum expect that rest of the code will going to run");
			System.out.println("Here is the end of our catch block");
		}
		System.out.println("-----Program ends------");
		
	}

}


