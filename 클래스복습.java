package 자바0929;

//클래스 C 생성

class c{
	//클래스 안에 작성한 필드변수라고 함.
	private String 이름;
	private int 나이;
	
	c(String 이름, int 나이){//파라미터가 있는 생성자
		
	}
	
	c(){ //파라미터가 없는 생성자
		
	}
	//필드변수가 private여서 get, set 함수를 이용해서
	//필드변수 데이터를 대입하고 호출한다.
	//getter, setter
	 
	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get나이() {
		return 나이;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}
}
class B{
	//B라는 클래스 생성 후 메인 함소드에 메소드 호출
	B(int x , int y){
		System.out.println("B class :hello world");
	}
	//메소드이름은 같은데, 파라미터 타입이 다를 때 : 오버로딩
	B(){
		
	}
}


class A{
	//기본적으로 제공 == Default
	A(){ //메소드 => 생성자
		//생성자는 메소드와 다르게 리턴타입이 없다.
	}
	
	public void A클래스에있는메소드() {
		System.out.println("hello world");
	}
	public int 메소드생성(int x) {
		return x;
	}
}

public class 클래스복습 {

	public static void main(String[] args) {
		A a = new A();
		//new A(); A클래스를 호출
		//A a 불러온 클래스를 a 라는 변수에 대입 (인스턴스화 하다, 객체를 생성하다)
		a.A클래스에있는메소드(); // 변수를 활용한 방법
		a.메소드생성(100);
		
		new A().A클래스에있는메소드(); //변수를 생성하고 클래스 호출 시 바로 메소드 호출
		
		B b = new B(50, 100); //B라는 클래스를 호출할 때 DeFault 생성자도 자동으로 호출 된다.
		
		
		}
	}
