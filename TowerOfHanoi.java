package recursion;
//Tower of hanoi code using recursion
public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int s=1;
		int h=2;int d=3;
		compute(n,s,h,d);
	}
	public static void compute(int n,int s,int h,int d) {
		if(n==1) {
			System.out.println(s +" to "+d);
			return;
		}
		compute(n-1,s,d,h);//hypothesis for smaller inputs
		compute(1,s,h,d);
		compute(n-1,h,s,d);
	}

}
