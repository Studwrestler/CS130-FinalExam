package FinalExam;

public class Rectangle {
	private double height;
	private double width;
	//Constructor
	public Rectangle(double height, double width) {
		this.height=height;
		this.width=width;
	}
	public double areaRec() {
		double area=height*width;
		return area;
	}
	public double periRec() {
		double peri = 2*(height+width);
		return peri;
	}
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(10,20);
		System.out.println("Area: "+rectangle1.areaRec());
		System.out.println("Perimeter: "+rectangle1.periRec());

	}

}
