package Chapter18Exception;

public class ExceptionEx02 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number / (int)(Math.random()*10); // ArithmeticException 0으로 정수 나눌 때, 실수는 가능
				System.out.println(result);
			} catch(ArithmeticException e) {
				System.out.println("0");
			}
		}
	}
}
