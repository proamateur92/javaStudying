package Chapter18Exception;

public class ExceptionEx15 {

	public static void main(String[] args) {
		ExceptionEx15.method1();
		System.out.println("method1메서드를 실행하고 메인메서드로 복귀하였습니다.");
	}
	
	static void method1() {
		try {
			System.out.println("method1메서드 실행합니다.");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("main메서드로 복귀합니다.");
		}
	}
}
