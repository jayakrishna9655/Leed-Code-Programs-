package Programs;

import java.util.ArrayList;
import java.util.List;

class SolutionStringMatching {
    public List<String> stringMatching(String[] words) {
    	
    	List<String> res = new ArrayList<String>();
    	
    	for(int i=0;i<words.length;i++) {
    		
    		for(int j=0;j<words.length;j++) {
    			
    			if(i!=j && words[j].contains(words[i])) {
    				res.add(words[i]);
    				break;
    			}
    			
    		}
    		
    	}
    	
		return res;
        
    }
}

public class StringMatchingArray {

	public static void main(String[] args) {
		String[] words = {"mass","as","hero","superhero"};
		SolutionStringMatching sol=new SolutionStringMatching();
		System.out.println(sol.stringMatching(words));
	}
	
}
