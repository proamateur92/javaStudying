package Chapter18Exception;

public class ExceptionEx04 {

	public static void main(String[] args) {
		System.out.println("0");
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(3/0);	
			System.out.println("3");
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5");
		}
		System.out.println("6");
	}
}
