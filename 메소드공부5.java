package 자바0913;

public class 메소드공부5 {
	/*
	 * public staitc 접근 지정자
	 * int : 리턴타입
	 * getSum 메소드 함수 이름 
	 * int x, int y, 파라미터 값 매개 변수
	 */
	public static int getSum(int x, int y) {
		return x + y;
	}
	/*
	 * public staitc 접근 지정자
	 * boolean : 리턴타입
	 * islogin 메소드 함수 이름 
	 * boolean islogin : 파라미터 값
	 */
	
	public static boolean isLogin(boolean isLogin) {
		return isLogin;
	}
	/*public static 접근 지정자
	 * String : 리턴타입
	 * getword : 메소드 함수 이름 
	 * String word : 파라미터 값 매개 변수
	 */
	public static String getword (String word) {
		return word;
	}
	public static void main(String[] args) {
		String word = getword("치즈돈까스");
								//치즈돈까스
	}
	
	
	public static void main(String[] args) {
		int result = getSum(10,10);
		// 문제 1. 예상되는 result 값은? 20
		System.out.println("결과 : "+result);
		//
		boolean isResult = isLogin(true);
		
	}

}
