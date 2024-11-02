package SecondPkg;
import java.util.Scanner;
public class areaofquadlilateralprogram {
	class quadlilateral{
		static void aboutquadlilateral() {
			System.out.println("Fun fact : a quadlilateral is the common name for all 4 sides shapes either there are equal or not.");
			System.out.println("Quick fact : The origin of the word quadrilateral is the two Latin words quadri, a variant of four, and latus, meaning side.");
		}
	}class areaofquadlilateral extends quadlilateral 
	{
	 static void areaOfRectangle() {
	    	Scanner s = new Scanner(System.in);
	        System.out.println("Enter lenght(l)");
	        double l = s.nextDouble();
	        System.out.println("Enter breadth(b)");
	        double b = s.nextDouble();
	       // quadlilateral q;
	        aboutquadlilateral();
	        System.out.println("The area of rectangle(has 4 sides) is (l*b) ="+ l*b);
	    } 
	 static void areaOfSquare() {
	    	Scanner s = new Scanner(System.in);
	        System.out.println("Enter side(S)");
	        double S = s.nextDouble();
	        System.out.println("The area of square(has 4 sides) is (S*S)="+ S*S);
	    } 
	 static void areaOfParallelogram() {
	    	Scanner s = new Scanner(System.in);
	        System.out.println("Enter base");
	        double b = s.nextDouble();
	        System.out.println("Enter height");
	        double h = s.nextDouble();
	        aboutquadlilateral();
	        System.out.println("The area of parallelogram(has 4 sides) is "+ h*b);
	    } 
	 static void areaOfRhombus() {
	    	Scanner s = new Scanner(System.in);
	        System.out.println("Enter base(b)");
	        double b = s.nextDouble();
	        System.out.println("Enter height(h)");
	        double h = s.nextDouble();
	        aboutquadlilateral();
	        System.out.println("The area of rhombus(has 4 sides) is(1/2*h*b) "+ 0.5*h*b);
	    }
	 static void areaOfTrapezium() {
	    	Scanner s = new Scanner(System.in);
	    	System.out.println("Enter base(a)");
	        double a = s.nextDouble();
	        System.out.println("Enter base(b)");
	        double b = s.nextDouble();
	        System.out.println("Enter height(h)");
	        double h = s.nextDouble();
	        aboutquadlilateral();
	        System.out.println("The area of trapezium or trapezoid (has 4 sides) is (1/2*(a+b)*h)"+ 0.5*h*b);
	        if(a==b) {
	        	System.out.println("If two parallel sises are equal in trapezium then it is called isosceles trapezium");
	        }
	    }
	 static void areaOfKite() {
		 Scanner s = new Scanner(System.in);
	        System.out.println("Enter diagnol 1(p))");
	        double p = s.nextDouble();
	        System.out.println("Enter diagonal 2 ()q");
	        double q = s.nextDouble();
	        aboutquadlilateral();
	        System.out.println("The area of kite(has 4 sides) is (1/2*p*q)="+ 0.5*p*q);
	 }
}
}