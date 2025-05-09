package basicNumbers;

public class SelectionSort {

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {4,6,8,2,9,1,5,7};

		// selection sort
		for (int i = 0; i < arr.length-1; i++) {
			int smallest = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]<arr[smallest]) {
					smallest = j;
				}
			}
			// swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			
		}
		printArray(arr);
		
	}

}
