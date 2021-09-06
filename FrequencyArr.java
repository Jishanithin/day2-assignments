package week1.day2;

public class FrequencyArr {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		int fr[] = new int[arr.length];
		int i, j, count = 1, visited = -1;
		for (i = 0; i < arr.length; i++) {
			count = 1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				fr[j] = visited;

				}
		}

		if (fr[i] != visited) 
			fr[i] = count;
		
		}
		for (i = 0; i < fr.length; i++) {
			if (fr[i] != visited) {
				System.out.println("frequency of array" + arr[i] + "is:" + fr[i]);
			}
		}
	}
}