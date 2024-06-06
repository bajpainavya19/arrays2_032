package Core;
import java.util.Scanner;
public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {50,40,32,67,98,22};
		int n;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search:");
		n=sc.nextInt();
		for(i =0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("Element found is: " + arr[i] + " at index: " + i);
				break;
			}
		}
		if(arr[i]!=n) {
		System.out.println("There is no such type of element is present");
		}

	}

}
