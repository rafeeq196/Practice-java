package Exercise;

public class RunningNumberSum1 {

	public static void main(String[] args) {
		final int lowerBound = 9;// store the lowerbound
		final int upperBound = 899;// store the upperbound
		
		int sum = 0;//sum of lowerbound and upperBound
		
		int number = lowerBound;
		while(number <=upperBound) {
			sum = sum + number;
			number++;
			} 
		System.out.println("The sum from "+lowerBound+" to "+upperBound+" is "+sum);

	}

}
