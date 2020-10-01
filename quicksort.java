//Quick Sort in java
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = new QuickSort().partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }


static void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        
        int pi = new QuickSort().partition(arr, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    } 
    }
class QuickSort
{

    static int partition(int arr[], int low, int high)
    {
        // add your code here
      int  i = (low - 1), j;  // Index of smaller element
    int  pivot = arr[high];  
    for (j = low; j <= high- 1; j++)
    {
        // If current element is smaller than the pivot
        if (arr[j] < pivot)
        {
            i++;    // increment index of smaller element
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    int temp=arr[i+1];
    arr[i+1]=arr[high];
    arr[high]=temp;
    return (i + 1);
    } 
    
}
