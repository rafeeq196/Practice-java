package questions27;

public class PrintAsciiValue {

	public static void main(String[] args) {
		char ch = 'H';
		int ascii = ch; // You can also cast char to int
		int castascii = (int) ch;
		System.out.println("The ASCII value of "+ ch +" is " +ascii );
		System.out.println("The ASCII value of "+ ch +" is " +castascii );
		

	}

}
