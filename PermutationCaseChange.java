package recursion;
//WAP to print all the pattern of a word which is a combination of both uppercase and lower case
public class PermutationCaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aBc";
		int n=0;
		compute(str,"",n);
	}
	public static void compute(String str,String str2,int n) {
		if(n==(str.length())) {
			System.out.println(str2);
			return;
		}
		if(Character.isDigit(str.charAt(n))) {
			compute(str,str2+str.charAt(n)+"",n+1);
			System.out.println("here");
		}
		else {
		char ch=str.charAt(n);
		if(Character.isLowerCase(ch)) {
			String sx=("" + ch).toUpperCase();
			compute(str,str2+sx,n+1);
			compute(str,str2+str.charAt(n)+"",n+1);
		}else {
			String sx=("" + ch).toLowerCase();
			compute(str,str2+sx,n+1);
			compute(str,str2+str.charAt(n)+"",n+1);	
		}
		
	}
	}
}
