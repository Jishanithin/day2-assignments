package week1.day2;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,7,6,8};
	int index=0,i;
	Arrays.sort(arr);
for(i=0;i<arr.length;i++) {
	index=i+1;
	if(arr[i]!=index) {
		
		System.out.println("missing number is"+index);
		break;
	}
}
	}
}

