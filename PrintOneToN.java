package recursion;
//WAP to print numbers 1 to n using recursion
public class PrintOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		compute(n);
	}
	public static void compute(int n) {
		if(n==0) {
			return;
		}else {
			compute(n-1);
			System.out.println(n);
		}
	}

}
