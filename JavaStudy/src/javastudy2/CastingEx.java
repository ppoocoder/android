package javastudy2;

//person 클래스
class Person {
	String name;
	String id;
	//name 매게변수만 있는 생성자	
	public Person(String name) {
		super();
		this.name = name;
	}


}

class Student extends Person {
	String grade;
	String department;
	//생성자 자동 완성이 안됨 ==> 별도로 추가
	
	public Student(String name){
		super(name); //상위클래스 생성자 호출 
	}

	public String toString() {
		return "이름은" +name + " 학생 번호는 " +id+ "성적은 " +grade +"학과" +department ;
	}


}




public class CastingEx {

	public static void main(String[] args) {
		Person p = new Student("자기이름");
		// p =s 와 동이랗ㄴ 표현(업캐스팅)
		//하위를 상위에 대입
		
//		p.grade ="a";
//		p.department ="학과";  ->>> 안됨 
		p.id="1234";
		//형변환 필요 
		
		Student s = (Student) p;
		
		s.id ="4434";
		s.grade ="a";
		s.department ="학과";
		
		
		System.out.println(p.id +","+ s.id+","+ s.grade +","+ s.department );

		Student s1 = new Student("자기이루");
		s1.id ="444444";
		s1.grade ="bb";	
		
		
	}
	
	
}
