package javastudy2;

public class Book {
	String title;
	String author;
	
	public void show () {
		System.out.println(title+ "" + author);
		
	}
	
	
	public Book(){
		this("","");
		System.out.println("생성장 호출 됨");


	}
	
	public Book(String title){
		this(title, "작가 미상");
	}
	
	public Book(String title, String author){
		this.title =title;
		this.author =author;
	}
	
	
}
