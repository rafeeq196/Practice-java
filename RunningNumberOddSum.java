package Exercise;

public class RunningNumberOddSum {

	public static void main(String[] args) {
		int lowerbound = 1;// lowest value
		int upperbound = 1000;// highest value
		int sum = 0;
		
		int number = lowerbound;
		while(number<=upperbound) {
			sum=sum+number;
			number=number+2;
		}
		System.out.println("The sum from "+lowerbound+" to "+upperbound+" is "+sum);

	}

}
