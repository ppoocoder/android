package javastudy2;

import java.util.Scanner;

class Rect1 {

	private double width;
	private double length;

	public Rect1() {

	}

//	public Rect1(double witdh, double length) {
//		super();
//		this.width = width;
//		this.length = length;
//
//	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double calcArea() {
		return width * length;
	}

	public String toString() {

		return " 가로 = " + width + " 높이 = " + length + " 넓이 = " + calcArea();
	}
}

public class RectangleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("가로를 입력해주세요. ");

		Rect1 r1 = new Rect1();

		r1.setWidth(sc.nextDouble());
		
		System.out.println("높이를 입력해주세요");
		r1.setLength(sc.nextDouble());
		
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
		
	}

}
