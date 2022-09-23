package Exercise;

public class CylinderComputation {

	public static void main(String[] args) {
		final double PI = 3.14;//it is constant value that cannot change
		double radius = 1.2;
		double height = 2.2;
		double surfaceArea =  (22*radius*(radius+height))/7;
		double volume = ((22*radius*radius*height)/7);
		double BaseArea = PI*radius*radius;
		
		System.out.println("The volume of a CylinderComputation is  "+volume );
		System.out.println("The surfaceArea of a CylinderComputation is  "+surfaceArea );
		System.out.println("The BaseArea of a CylinderComputation is  "+BaseArea );
		

	}

}
