package dp;

public class knapSacksSimpleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[]= {1,3,4,5};
		int val[]= {3,4,5,7};
		int W=7;
		int n=wt.length;
		System.out.println(knapSack(wt,val,W,n));
	}
	public static int knapSack(int wt[],int val[],int W,int n) {
		if((W==0)||(n==0)) {
			return 0;
		}
		if(wt[n-1]<=W) {
			return Math.max(val[n-1]+knapSack(wt,val,W-wt[n-1],n-1), knapSack(wt,val,W,n-1));
		}
		return knapSack(wt,val,W,n-1);
	}

}
