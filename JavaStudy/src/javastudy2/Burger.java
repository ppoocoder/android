package javastudy2;

public class Burger {

	public static void main(String[] args) {
		//인터페이스 객체 변수  = new 클래스명()

		BurgerCook cook = new HotelCook();
		cook.makeBurger();
		cook.makeSalad();
		
		BurgerCook cook1 = new InstantCook();
		cook1.makeBurger();
		cook1.makeSalad();
	
	
	}

}
