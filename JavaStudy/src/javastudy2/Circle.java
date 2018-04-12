package javastudy2;

public class Circle {

	int radius;
	String name;
	
	public Circle(){
		
	}
	
	
	public Circle(int r, String n){
		
		radius =r;
		name =n;
	
	}
	
	public double getArea() {
		
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle pizza = new Circle(10,"자바피자");
 
		
		Book javabook = new Book("java","자기이름");
		Book bible = new Book("bible");
		Book emptyBook = new Book();
		javabook.show();
		bible.show();
		emptyBook.show();
		
	}

}
