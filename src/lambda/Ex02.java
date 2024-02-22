package lambda;
interface Test02{
	public void test();
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02() {
			@Override
			public void test() {
				System.out.println("test 실행");
			}
		};
		t.test();
		System.out.println("--- 람다 ----");
		Test02 t02 = () -> System.out.println("test실행222");
		t02.test();
	}
}









