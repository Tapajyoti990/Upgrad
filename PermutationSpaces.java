package recursion;
//WAP to print pattern in a string in such a way that spaces are either included or eliminated
public class PermutationSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="EADGB";
		int n=0;
		compute(str,"",n);
	}
	public static void compute(String str,String str2,int n) {
		if(n==(str.length()-1)) {
			System.out.println(str2+str.charAt(n));
			return;
		}
		compute(str,str2+str.charAt(n)+" ",n+1);
		compute(str,str2+str.charAt(n)+"",n+1);
	}

}
