package entities;

public class Rectangle {
  
  private double width;
  private double height;  

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;    
  }

  public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));	
	}
	
	public String toString() {
		return 	
        "AREA = " + String.format("%.4f%n", area()) +
				"PERIMETRO = " + String.format("%.4f%n", perimeter()) +
				"DIAGONAL = " + String.format("%.4f%n", diagonal());
	}
	


}
