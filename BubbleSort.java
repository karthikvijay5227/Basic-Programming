import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter elements:");
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	bubbleSort(arr);
	System.out.println("Sort");
	for(int i=0;i<3;i++)
	{
	    System.out.print(arr[i]+" ");
	}	
	sc.close();
	}
	static void bubbleSort(int[] arr) {

  boolean swapped = true;

  for(int i = 0; i < arr.length-1; i++) {

    swapped = false;

    for(int j = 0; j < arr.length-i-1; j++) {

      if(arr[j] > arr[j+1]) {

        int temp = arr[j];

        arr[j] = arr[j+1];

        arr[j+1] = temp;

        swapped = true;

      }

    }

    if(swapped == false)

      break;

  }

}
}