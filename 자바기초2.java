package 자바0913;

public class 자바기초2 {

	public static void main(String[] args) {
		int x = 10;
		//if(조건)
		// = (대입연산자) , ==(같다), != (다르다)
		/*
		if (x == 10) {
			System.out.println("A");
		}
		if (x >5) {
			System.out.println("실행");
		}
		if(3 == 4) {
			System.out.println("IF 실행");
		}else {
			System.out.println("ELSE 실행");
		}
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은 "+num);
		
		//받아온 값이 짝수면 짝수입니다. 아니면 홀수입니다. 출력해보시오!
		if((num%2) == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
	}
		

	}

