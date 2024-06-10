package Core;

public class finall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b=9;
		while(true) {
			try {
				System.out.println(a/b);
			}
			catch(Exception e) {
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("I am finally for b : " + b);
			}
			b--;
		}

	}

}
