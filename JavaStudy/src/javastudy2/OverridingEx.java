package javastudy2;


class Shape {
	public void draw(){
		
		System.out.println("����");
		
		
	}
	// ������ ����Ÿ�� �޼��� �̸�(�Ű�����..)
}

class Line extends Shape {
	public void draw(){
		System.out.println("��");
	}
}

class Circle2  extends Shape {
	public void draw(){
			System.out.println("��");
	}

}

class Rect2 extends Shape {
	public void draw(){
		System.out.println("�簢��");
	}
}

public class OverridingEx {
	static void paint(Shape p){
		p.draw(); // ����Ŭ������ �ִ� draw()
		
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Line());
	}

}
