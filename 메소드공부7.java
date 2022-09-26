package 자바0913;

public class 메소드공부7 {
	/*
	 * public static 접근 제어자
	 * int 리턴타입
	 * getNum 메소드이름
	 * int x , String y : 파라미터 타입
	 */
	public static int getNum(int x ,String y) { //파라미터안에는 모든 데이터 타입 가능
		return 0;
	}
	
	public static int getNum(int x, String y, String z) {
		return 10;
	}
	/* 문제2 만들기 -> main함수에 호출 하시오
	 * public 접근제어자
	 * boolean 리턴 타입
	 * isTrue 메소드 이름
	 * boolean ,String 파라미터
	 */
	public static boolean isTrue(boolean x, String y) {
		return false;
	}
	
	public static String getStr() {
		return "피자빵";
	}
	
	public static int 피자빵주세요(int 빵) {
		return 빵;
	}
	
	public static int 돈을인출하다(int 돈) {
		return 3000;
	}
	//메소드 이름은 같으나 파라미터 타입, 개수가 다르면 메소드 이름 중복 사용가능 (==오버로딩)
	public static int 돈을인출하다(int 돈, String 계좌) {
		if(계좌.equals("카카오뱅크")) {
			return 돈;
		}
		if(계좌.equals("농협")) {
			return 돈;
		}
		return 0;
	}	
	public static int 돈을해외로송금하다(int 금액, String 해외) {
		if(해외.equals("수리남"))
			return 500;
	}
	return 금액
	public static void main(String[] args) {
	int 돈 = 돈을인출하다(3000, "카카오뱅크");
	
	int money = 돈을인출하다(1000);
	System.out.println(money);
	
		getNum(10, "붕어빵"); //메소드 호출
		//메소드에 리턴이 있으면 대입이 가능하다.
		int y = getNum(10, "붕어빵","피자붕어빵");
		System.out.println("결과 => "+y);
		boolean isX = isTrue(true,"금요일");
		System.out.println("결과 =>"+isX);
		String word = getStr();
		System.out.println("결과 =>"+word);
		int 빵 = 피자빵주세요(100);
		System.out.println(빵);
	}

}
