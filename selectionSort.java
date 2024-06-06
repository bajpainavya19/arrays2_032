package Core;

public class selectionSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// Selection sort TIME COMPLEXITY O(N^2)
		int arr[] = {43,32,90,78,65};
		for(int i=0;i<arr.length-1;i++) {
			int smallest =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest = j;
				}
			}
			
			int temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
	   printArray(arr);
	}
}
