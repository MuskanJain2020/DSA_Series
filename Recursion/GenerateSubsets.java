

public class GenerateSubsets {
	
	public static void subSets(String s , String curr , int i) {
		if (i==s.length()) {
			System.out.print(curr+ " ");
			
			return ;
		}
		subSets(s,curr, i+1);
		subSets(s,curr+s.charAt(i), i+1);
	}
	
	
	
	public static void main(String[] args) {
      String S = "MUSKAN";
      subSets(S," ", 0);

	}

}
