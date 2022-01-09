package shapePractice;

public class Reactangle extends Shape {
	double width,length,p,area;
	
	void setWidth() {
		 System.out.println("Enter width");
		  width=sc.nextDouble();
	  }
	void getWidth() {
		 System.out.println(" Radius ="+width);
		 
	  }
	void setLength() {
		 System.out.println("Enter Length");
		 length=sc.nextDouble();
	  }
	void getLength() {
		 System.out.println(" Radius ="+length);
		 
	  }
	void getArea() {
		area=(length*width)/2;
		 System.out.println(" Area of circle  ="+area);
		 
	  }
	void getPerimeter() {
		p=2*(length*width);
		 System.out.println(" Perimeter of Rectangle ="+p);
		 
	  }
}
