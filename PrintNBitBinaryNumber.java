package recursion;
//WAP to print patterns of binary number in such a way that number of ones are always more than number ofzeroes, n denotes number of ones initially
public class PrintNBitBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		compute("",n,n,n);
	}
	
	public static void compute(String str,int RemOnes,int RemZeroes,int n) {
		
		if(n==0) {
			System.out.println(str);
			return;
		}
		if(RemOnes<(RemZeroes)) {
			compute(str+"1",RemOnes-1,RemZeroes,n-1);
			compute(str+"0",RemOnes,RemZeroes-1,n-1);
			return;
		}
		compute(str+"1",RemOnes-1,RemZeroes,n-1);
	}

}
