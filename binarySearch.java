package Core;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60};
		int start = 0;
		int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		
		int end = arr.length-1;
        int mid = (start + end)/2;
        
        while(start<=end) {
        	if(arr[mid]<n) {
        		start=arr[mid] +1;
        		
        	}
        	else if(arr[mid]==n) {
        		System.out.println("Our searching Value is: " + arr[mid]);
        		break;
        	}
        	else {
        		end = mid-1;
        	}
        	mid = (start + end)/2;
        }
        if(start>end) {
        	System.out.println("Value not found");
        }
	}

}
