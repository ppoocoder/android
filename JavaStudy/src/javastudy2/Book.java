package javastudy2;

public class Book {
	String title;
	String author;
	
	public void show () {
		System.out.println(title+ "" + author);
		
	}
	
	
	public Book(){
		this("","");
		System.out.println("������ ȣ�� ��");


	}
	
	public Book(String title){
		this(title, "�۰� �̻�");
	}
	
	public Book(String title, String author){
		this.title =title;
		this.author =author;
	}
	
	
}
