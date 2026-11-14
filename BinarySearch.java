package Programs;

class SolutionSearch {
    public int search(int[] nums, int target) {
    	
    	int left=0;
    	int right=nums.length-1;
    	int mid=0;
    	
    	while(left<=right) {
    		
    		mid=left+(right-left)/2;
    		System.out.println(mid);
    		if(nums[mid]==target) {
    			System.out.println("res : "+mid);
    			return mid;
    		}
    		
    		if(nums[mid]>target) {
    			right = mid-1;
    		}
    		if(nums[mid]<target) {
    			left=mid+1;
    		}
    		
    		
    	}
    	System.out.println("las : "+mid);
		return -1;
    }
}
public class BinarySearch {

	public static void main(String[] args) {
		
		SolutionSearch sol = new SolutionSearch();
		
		int[] nums = {-1, 0, 3, 5, 9, 12};
		int target = 0;
		
		sol.search(nums, target);
		
	}
	
}
