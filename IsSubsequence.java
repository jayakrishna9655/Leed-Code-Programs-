package Programs;

import java.util.HashMap;

class SolutionIsSubsequence {
    public boolean isSubsequence(String s, String t) {
    	
//    	HashMap<Integer, Character> map = new HashMap<Integer, Character>();
    	int i=0,j=0;
    	while(i != s.length() && j!=t.length()) {
    		
    		System.out.println(i+" = "+s.charAt(i)+"  "+t.charAt(j));
    		
    		if(s.charAt(i) == t.charAt(j)) {
    			i++;
    			j++;
    		}
    		else {
    			j++;
    		}
    		
    	}
    	
    	if(i== s.length()) {
    		return true;
    	}
    	
		return false;
    }
}

public class IsSubsequence {

	public static void main(String[] args) {
		
		String s = "ndoe",t = "neetcode";
		
		SolutionIsSubsequence sol = new SolutionIsSubsequence();
		
		System.out.println(sol.isSubsequence(s, t));
		
	}
	
}
