package com.practice.recursion;

public class Check_Sorted_String_increasing {

	public static boolean checkifIncreasing(int arr[], int idx) {
		if(idx == arr.length-1) {
			return true;
		}
		if(!checkifIncreasing(arr, idx+1)) {
			return false;
		}
		return arr[idx] < arr[idx +1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int arr1[] = {1,2,3,4,5};// inc
		int arr2[] = {1,6,3,4,5};
		if (checkifIncreasing(arr2, 0)) {
			System.out.println("Strictly Increasing ");
		}else {
			System.out.println("Not Strictly Increasing ");
		}
		
	}

}
