import java.util.Arrays;

public class Selectionsort {

	public static void selectionSort(int arr[],int N) {
	int count=0;
		for(int i=0;i<N-1;i++) {
			for (int j=i+1;j<N;j++) {
			count++;
				if(arr[i]>arr[j]) {	
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}System.out.println("The Comparisions are"+count);
	}
	
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {44,11,55,22,66,33};
		
		System.out.println("Before Sorting Array"+Arrays.toString(arr));
		
		selectionSort(arr,arr.length);
		
		System.out.println("After Sorting Array"+Arrays.toString(arr));
		
		
	}

}
