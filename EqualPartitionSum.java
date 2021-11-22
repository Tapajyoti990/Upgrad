package dp;

public class EqualPartitionSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,4};
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		if(sum%2!=0) {
			System.out.println("False");
		}else {
			sum/=2;
			System.out.println(compute(arr,sum,n));
		}
		
	}
	public static boolean compute(int arr[],int sum,int n) {
		if(sum==0) {
			return true;
		}
		if(n==0) {
			return false;
		}
		if(arr[n-1]<=sum) {
			return compute(arr,sum-arr[n-1],n-1)||compute(arr,sum,n-1);
		}
		return compute(arr,sum,n-1);
	}

}
