package pkgMain;

import exceptions.TriangleException;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
	}

	/**
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3) throws TriangleException {
		super();
		if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
			throw new TriangleException(this);
		} else {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
	}

	/**
	 * 
	 * @return
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * 
	 * @param side1
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/**
	 * 
	 * @return
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * 
	 * @param side2
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/**
	 * 
	 * @return
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * 
	 * @param side3
	 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/**
	 * 
	 * @return area or exception
	 */
	@Override
	public double getArea() {
		double s = this.getPerimeter() / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), .5);
		return area;
	}

	/**
	 * 
	 * @return perimeter
	 */
	@Override
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	/**
	 * 
	 * @return string
	 */
	@Override
	public String toString() {
		return ("Side1: " + side1 + ", Side2: " + side2 + ", Side3: " + side3);
	}
}
