
public class Array1D {
	public static void main(String args[]) {
	int arr[] = {1,2,3,3,5};
	int sum=0;
	double avg;
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
		sum = sum+arr[i];
	}
	avg = (double)sum/arr.length;
	System.out.println(avg);
	}
}
