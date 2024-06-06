package Core;

public class bubbleSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
   
	public static void main(String[] args) {      //TIME COMPLEXITY O(N^2)
		// TODO Auto-generated method stub
		//Bubble Sort
		int arr[] = {43,87,56,33,21,90};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[i]>arr[j+1]) {
					int temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
       
		printArray(arr);
	}

}
