package questions27;

public class CastingExercise {

	public static void main(String[] args) {
		byte b=10;
		int i =b;//will accept this promotion 
		int a = 5;
		double ab = a;// this will also accept but when we try to move higher its not possible (double to int )
		int ac = ab;// this will show error
		System.out.println(ac);

	}

}
