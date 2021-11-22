package recursion;
//Write a program to print pattern of all opening brackets and closed brackets in such a way that brackets patterns are balanced
public class Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int lb=n;
		int rb=n;
		solve("",n,lb,rb);
	}
	public static void solve(String str,int n,int lb,int rb) {
		if((lb==0)&&(rb==0)) {
			System.out.println(str);
			return;
		}
		if(lb==rb) {
			solve(str+"(",n,lb-1,rb);
			return;
		}
		if((lb==0)&&(rb!=0)) {
			solve(str+")",n,lb,rb-1);
			return;
		}
		solve(str+"(",n,lb-1,rb);
		solve(str+")",n,lb,rb-1);
	}

}
