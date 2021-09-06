package week1.day2;

public class PrintDuplicate {

	public static void main(String[] args) {
	int arr[]= new int[]{14,12,13,11,15,14,18,16,17,19,18,17,20};
	
	int i,j;
	for(i=0;i<arr.length;i++) {

for(j=i+1;j<arr.length;j++) {
	if(arr[i]==arr[j]) 
		
			System.out.println("duplicate number is:"+arr[i]);	
	
}

	}
	}

}
