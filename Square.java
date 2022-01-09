package shapePractice;

public class Square extends Reactangle {
	double side;
	void setside() {
		 System.out.println("Enter width");
		  side=sc.nextDouble();
	  }
	void getside() {
		 System.out.println(" Radius ="+side);
		 
	  }
	void getAreaSquare() {
		 area=side*side;
	}
	
	public static void main(String[] args) {
		
		Square  s= new Square();
				s.getColor();
				s.printColor();
				s.getFilled();
				s.printfilled();
				s.getWidth();
				s.getLength();
				s.setWidth();
				s.setLength();
				s.setside();
				s.getside();
				s.getArea();
				s.getPerimeter();
				s.getAreaSquare();
				
			}

}
