package dp;

import java.util.ArrayList;
//No of ways to pick up numbers in an array so that sum is zero
public class CountSubsetGivenDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3};
		int sum =0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		int diff=1;
		boolean dp[][]=new boolean[n+1][sum+1];
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(j==0) {
					dp[i][j]=true;
				}else {
					if(i==0) {
						dp[i][j]=false;
					}
				}
			}
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
				if(arr[i-1]<=j) {
					dp[i][j]=(dp[i-1][j-arr[i-1]]) || (dp[i-1][j]);
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
			System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		ArrayList<Integer>al = new ArrayList<Integer>();
		for(int j=0;j<=(sum)/2;j++)
		{
			if(dp[n][j]==true) {
				al.add(j);
			}
		}int min=Integer.MAX_VALUE;int posSum=0;
		for(int i=0;i<al.size();i++) {
			if(sum-(2*al.get(i))==diff) {
				posSum=al.get(i);
			}
		}
		int dp2[][]=new int[n+1][posSum+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<posSum+1;j++) {
				if(j==0) {
					dp2[i][j]=1;
				}else {
					if(i==0) {
						dp2[i][j]=0;
					}
				}
			}
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<posSum+1;j++) {
				if(arr[i-1]<=j) {
					dp2[i][j]=(dp2[i-1][j-arr[i-1]]) + (dp2[i-1][j]);
				}else {
					dp2[i][j]=dp2[i-1][j];
				}
			}
		}
		System.out.println(dp2[n][posSum]);
		
	}

}
