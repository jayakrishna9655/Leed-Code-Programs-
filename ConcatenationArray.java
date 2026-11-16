package Programs;

class SolutionGetConcatenations {
    public int[] getConcatenation(int[] nums) {
    	
    	int temp[] = new int[nums.length*2];
    	int count=0;
    	
    	for(int i=0;i<temp.length;i++) {
    		
    		if(count == nums.length) {
    			count=0;
    		}
    		
    		temp[i]=nums[count];
    		count++;
    	}
    	
    	for(int i:temp) {
    		System.out.print(" "+i+" ");
    	}
		return temp;
    }
}

public class ConcatenationArray {

	public static void main(String[] args) {
		
		int[] nums = {1,4,1,2};
		
		SolutionGetConcatenations sol = new SolutionGetConcatenations();
		
		sol.getConcatenation(nums);
		
	}
	
}
