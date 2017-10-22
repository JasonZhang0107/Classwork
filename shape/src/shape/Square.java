package shape;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}

	@Override
	public String toString() {
		// To be written by student
		return "Square Side: " + side + " Area: " + this.calculateArea() + " Perimeter: "
		+ this.calculatePerimeter();
	}

}