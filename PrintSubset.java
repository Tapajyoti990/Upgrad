package recursion;

public class PrintSubset {
//WAP to print all the pattern in a string that is formed by eliminating any number of digits, considering that the sequence must remain same
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="dabc";
		int l=str1.length()-1;
		String str2="";
		compute(str1,str2,l);
	}
	public static void compute(String str1,String str2,int l) {
		if(l<0) {
			String s ="";
			for(int i=str2.length()-1;i>=0;i--){
				s=s+str2.charAt(i);
			}
			System.out.println(s);
		}else {
			compute(str1,str2+str1.charAt(l)+"",l-1);
			compute(str1,str2,l-1);
		}
	}

}
