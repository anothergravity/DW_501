package 자바0913;

public class 메소드공부4 {

	/*
	 * public static : 접근 제어자
	 * int : 리턴 타입
	 * getsum : 메소드(함수) 이름
	 * int x : 파라미터 타입(혹은 매개변수)
	 */
	public static int getsum(int x) {
		return x;
	}
	
	/*
	 * public static : 접근 제어자
	 * int : 리턴 타입
	 * getword : 메소드(혹은 함수) 이름
	 * int x : 파라미터 타입(혹은 매개변수)
	 */
	
	public static int String getword(String x) {
		return x;
	}
	
	/*
	 * public static : 접근 제어자
	 * boolean : 리턴 타입
	 * istrue : 메소드 이름
	 * 파라미터 값 없음
	 */
	
	public static int boolean isTrue() {
		return true;
	}
	
	/*
	 * public static : 접근 제어자
	 * int : 리턴 타입
	 * getSum : 메소드 이름
	 * int x, int y : 파라미터 타입(매개 변수)
	 */
	
	
	public static int getsum(int x, int y) {
		return 10;
	}
	
	public static int getcount(int startNum, int endNum) {
		//문제 1. startNum 이 endNum보다 크면 startNum을 리턴
		// endNum이 startNum보다 크면 endNum을 리턴하는 로직을 구현하시오.
		if (startNum > endNum) return startNum;
		if	(startNum < endNum) return endNum;
		return 0;
	}
	
	public static int 일부터십까지합구하기( ) {
		//1 ~ 10 까지 합을 구하는 로직을 구현 후 합을 리턴하시오.
		if sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		return 0;
	}
	
	public static int 짝수개수() {
		//1부터 20까지 짝수 개수를 구하고 개수를 리턴하시오.
		int count = 0;
		for(int i=1; i<=20; i++) {
			if(i%2 == 0) ++count;
		}
		return count;
	}
	/*
	 * 메소드 사용하는 이유
	 * 1. 업무 분담
	 * 2. 유지보수 편리성
	 */
		public static int solution(int n) {
			//1 비트에 표현할 수 있는 수가 8자리
			int answer = 0; //int 4 byte (1 byte == 8 bit)
			long x = n; // long 8byte
			while(x != 1) {
				if(n%2 ==0) {
					x= x / 2;
					++answer;
				}else {
					x = (x * 3) + 1;
					++answer;
				}
				if(answer > 500) return -1;
			}
			return answer;
			}
		}

	public static void main(String[] args) {
		getcount(10,1); //메소드 불러오다
		int result = solution(6)
		System.out.println();
	}=

}






