package dp;

//nUMBER OF WAYS TO BUILD PICK A COIN SO THAT SUM IS EQUAL TO THE GIVEN SUM
public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//derivative of unbound sum subset
		int arr[]= {1,2,3};
		int n=arr.length;
		int sum=5;


		System.out.println(compute(arr,n,sum));
	}
	public static int compute(int arr[],int n,int sum) {
		
		
		if(sum == 0) {
			return 1;
		}
		if((n==0)) {
			return 0;
		}
		if(arr[n-1]<=sum) {
			return compute(arr,n,sum-arr[n-1])+compute(arr,n-1,sum);
		}
		
			return compute(arr,n-1,sum);
		
	}
}
