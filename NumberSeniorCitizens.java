package Programs;

class SolutionCountSeniors {
    public int countSeniors(String[] details) {
    	
    	int count=0;
    	
    	for(String w : details) {
    		
    		String[] temp = w.split("[a-zA-Z]");
    		String temp1=temp[1];
    		String ages =""+ temp1.charAt(0)+temp1.charAt(1);
    		int age= Integer.parseInt(ages);
    		System.out.println("age "+age);
    		
    		if(age>=60) {
    			count++;
    		}
    		
    	}
    	System.out.println(count);
		return count;
    }
}

public class NumberSeniorCitizens {

	public static void main(String[] args) {
		
		String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
		
		SolutionCountSeniors sol = new SolutionCountSeniors();
		
		sol.countSeniors(details);
		
	}
	
}
