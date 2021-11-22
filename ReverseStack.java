package recursion;
//WAP to reverse a stack using Recursion
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stk=new Stack<Integer>();
		stk.push(2);
		stk.push(3);
		stk.push(5);
		stk.push(0);
		stk.push(1);
		int top=stk.size()-1;
		compute(stk,top);
		for(int i=0;i<stk.size();i++) {
			System.out.println(stk.get(i));
		}
	}
	public static void compute(Stack stk,int top) {
		if(top==0) {
			return;
		}
		compute(stk,top-1);
		int topless=top;
		while((topless>0)&&((int)stk.get(topless)<(int)stk.get(topless-1))) {
			int temp=(int)stk.get(topless);			
			stk.remove(topless);
			stk.add(topless-1,temp);
			topless--;
		}
	}

}
