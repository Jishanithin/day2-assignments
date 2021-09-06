package week1.day2;

public class FindInterasection {

	public static void main(String[] args) {
int arr1[]= {3,2,11,4,6,7};
int arr2[]= {1,2,8,4,9,7};
int i,j;
for(i=0;i<arr1.length;i++) {	

	for(j=0;j<arr2.length;j++) {
		if(arr1[i]==arr2[j]) {
			System.out.println("the number is"+arr1[i]);
		}
	}
}
	}

	}


