package Programs;

class SolutionAppendCharacters {
    public int appendCharacters(String s, String t) {
    	
    	int count=0;
    	int tL=0;
    	int sL=0;
    	while(sL != s.length() && tL != t.length()) {
    		
    		if(t.charAt(tL) == s.charAt(sL)) {
    			
    			tL++;
    			
    		}
    		
    		sL++;
    		
    	}
    	
		return t.length() - tL;	
    }
}

public class AppendCharacterstoStringtoMakeSubsequence {

	public static void main(String[] args) {
		
		String s = "coaching";
		String t = "coding";
		
		SolutionAppendCharacters sol = new SolutionAppendCharacters();
		
		System.out.println(sol.appendCharacters(s, t));
		
	}
	
}
