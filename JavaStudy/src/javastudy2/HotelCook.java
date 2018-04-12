package javastudy2;

public class HotelCook implements BurgerCook {
//인터페이스에 있는 메서드를 구현하는 부분 
	@Override
	public void makeBurger() {
		// TODO Auto-generated method stub
		System.out.println("호텔 햄버거 ");
	}

	@Override
	public void makeSalad() {
		// TODO Auto-generated method stub
		System.out.println("호텔급 샐러드");
	}

}
