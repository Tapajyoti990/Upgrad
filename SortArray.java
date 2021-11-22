package recursion;
//WAP to sort an array using recursion
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,0,2,0};
		int n=arr.length;
		compute(arr,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void compute(int arr[],int n) {
		if(n<=0) {
			return;
		}
		compute(arr,n-1);
		int n1=n;
		while((n1>0)&&(arr[n1-1]>arr[n1])) {
			int temp=arr[n1];
			arr[n1]=arr[n1-1];
			arr[n1-1]=temp;
			n1--;
		}
		
	}

}
