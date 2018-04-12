package javastudy2;


class Shape {
	public void draw(){
		
		System.out.println("도형");
		
		
	}
	// 접근자 리턴타입 메서드 이름(매개변수..)
}

class Line extends Shape {
	public void draw(){
		System.out.println("선");
	}
}

class Circle2  extends Shape {
	public void draw(){
			System.out.println("원");
	}

}

class Rect2 extends Shape {
	public void draw(){
		System.out.println("사각형");
	}
}

public class OverridingEx {
	static void paint(Shape p){
		p.draw(); // 상위클래쓰에 있는 draw()
		
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Line());
	}

}
