package Programs;

class SolutionScoreOfString {
    public int scoreOfString(String s) {
    	
    	int sum=0;
    	for(int i =0;i<s.length()-1;i++) {
    		 sum += Math.abs(s.charAt(i) - s.charAt(i+1));
    	}
		return sum;
    }
}

public class ScoreOfString {

	public static void main(String[] args) {
		
		SolutionScoreOfString sol = new SolutionScoreOfString();
		
		String s = "hello";
		
	    sol.scoreOfString(s);
		
	}
	
}
