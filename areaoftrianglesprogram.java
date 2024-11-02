package SecondPkg;

import java.util.Scanner;

public class areaoftrianglesprogram {
	class Triangles{
		static void aboutTriangles() {
			System.out.println("Fun fact : Triangle is a 3 sided polygon and also a base name for all its type ");
			System.out.println("Quick fact : Triangle comes from the Latin word triangulus, \"three-cornered\" or \"having three angles,\".");
	}
		}
	class areaOfTriangles extends Triangles{
		static void areaOfTriangle() {
    	Scanner s = new Scanner(System.in);
        System.out.println("Enter base(b)");
        double b = s.nextDouble();
        System.out.println("Enter height(h)");
        double h = s.nextDouble();
        aboutTriangles();
        System.out.println("The area of triangle(has 3 sides) is (1/2*b*h)="+ 0.5*h*b);
    }
		static void areaOfEquilateralTriangle() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter base(b)");
			double b = s.nextDouble();
			aboutTriangles();
			System.out.println("The area of equilateral triangle is((3^1/2)/4*b^2) = "+0.4330127018922193*b*b);
		}
		

}
}
