package Programs;

class SolutionLengthOfLastWord {
    public int lengthOfLastWord(String s) {
    	
    	String[] word = s.split(" ");
    	System.out.println(word[word.length-1].length());
    	
        return word[word.length-1].length();
    }
}
public class LengthLastWord {

	public static void main(String[] args) {
		
		SolutionLengthOfLastWord sol = new SolutionLengthOfLastWord();
		
		String s = "Helloss Worlds";
		
		System.out.println(sol.lengthOfLastWord(s));
		
	}
	
}
