package Chapter18Exception;

public class ExceptionEx06 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음."); // Exception 인스턴스에 String을 넣어 .getMessage()로 출력
			throw e;
			// throw new Exception("고의로 발생시켰음.");
		} catch (Exception e) {
			System.out.println("에러메시지: "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}
}
