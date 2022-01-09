package shapePractice;



public class Circle extends Shape {
	double area, radius,p;
	double pi=3.14;
	void setRadius() {
		 System.out.println("Enter Radius");
		  radius=sc.nextDouble();
	  }
	void getRadius() {
		 System.out.println(" Radius ="+radius);
		 
	  }
	void getArea() {
		area=pi*radius*radius;
		 System.out.println(" Area of circle  ="+area);
		 
	  }
	void getPerimeter() {
		p=2*pi*radius;
		 System.out.println(" Perimeter of circle ="+p);
		 
	  }
	
	public static void main(String[] args) {
		
Circle  c= new Circle();
		c.getColor();
		c.printColor();
		c.getFilled();
		c.printfilled();
		c.setRadius();
		c.getRadius();
		c.getArea();
		c.getPerimeter();
		
	}
	
	}


