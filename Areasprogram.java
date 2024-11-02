package SecondPkg;
import java.util.Scanner;
import SecondPkg.areaofquadlilateralprogram.areaofquadlilateral;
import SecondPkg.areaoftrianglesprogram.areaOfTriangles;
import SecondPkg.areaofotherspolygonprogram; 
public  class Areasprogram {	
  	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no.of sides your polygon has ");
		int n = s.nextInt();
	
	if(n==3) {
		 System.out.println("Enter 1 for area of triangle(except equilateral) ,2 for area of equilateral triangle");
		 int a = s.nextInt();
		 switch(a) {
		 case 1:{
		areaOfTriangles.areaOfTriangle();}
		 
		 case 2:{
		areaOfTriangles.areaOfEquilateralTriangle(); 
		 }
		 } }
     if(n==4) {
    	 System.out.println("Enter 1 for area of rectangle ,2 for area of square ,Enter 3 for area of parallelogram");
    	 System.out.println("Enter 4 for area of trapezium(trapezoid) , Enter 5 for area of rhombus,Enter 6 for area of kite");
    	 int a = s.nextInt();
    	 switch(a) 
    	 {
    	 case 1: {
    		 areaofquadlilateral.areaOfRectangle();
    		 break;
    	 }
    	 case 2:{
    		 areaofquadlilateral.areaOfSquare();
    		 break;
    	 }
    	 case 3:{
    		 areaofquadlilateral.areaOfParallelogram(); 
    	 break;
    	 }
    	 case 4 :{
    		 areaofquadlilateral.areaOfTrapezium();
    	 break;
    	 }
    	 case 5 :{
    		 areaofquadlilateral.areaOfRhombus();
    	  break;	 
    	 }
    	 case 6 :{
    		 areaofquadlilateral.areaOfKite();
    	 }
    	 }
    	 }
     if (n == 5) {
    	 areaofotherspolygonprogram.areaOfPentagon();
     }
     } }  

