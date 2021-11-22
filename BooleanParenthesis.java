package dp;
//number of ways to put a parenthesis around an expression so that final evaluation is true
public class BooleanParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="T|F&T|F";
		int n=s.length();
		int i=0;
		int dp[][][]=new int[n+1][n+1][2];
		for(int im=0;im<n+1;im++) {
			for(int jm=0;jm<n+1;jm++) {
				for(int km=0;km<2;km++) {
					dp[im][jm][km]=-1;
				}
			}
		}
		System.out.println(solve(s,i,n-1,true,dp));
	}
	public static int solve(String s,int i,int j,boolean isTrue,int dp[][][]) {
		if(isTrue) {
			if(dp[i][j][1]!=-1) {
				return dp[i][j][1]; 
			}
		}else {
			if(dp[i][j][0]!=-1) {
				return dp[i][j][0];
			}
		}
		if(i>j)
			return 0;
		if(i==j) {
			if(isTrue) {
				return (s.charAt(i)=='T')?1:0;
			}else {
				return (s.charAt(i)=='F')?1:0;
			}
		}
		int sum=0;int target=0;
		for(int k=i+1;k<=j-1;k++) {
			int leftT=solve(s,i,k-1,true,dp);
			int leftF=solve(s,i,k-1,false,dp);
			int rightT=solve(s,k+1,j,true,dp);
			int rightF=solve(s,k+1,j,false,dp);
			if(s.charAt(k)=='^') {
				if(isTrue) {
				target=(leftT*rightF)+(rightT*leftF);	
				}else {
					target=(leftF*rightF)+(leftT*rightT);
				}
			}
			if(s.charAt(k)=='|') {
				if(isTrue) {
					target=(leftT*rightT)+(leftF*rightT)+(leftT*rightF);
				}else {
					target=leftF*rightF;
				}
			}
			if(s.charAt(k)=='&') {
				if(isTrue) {
					target=leftT*rightT;
				}else {
					target=(leftT*rightF)+(leftF*rightT);
				}
			}
			sum=sum+target;
			if(isTrue) {
				dp[i][j][1]=sum;
			}else {
				dp[i][j][0]=sum;
			}
			
		}
		return sum;
	}

}
