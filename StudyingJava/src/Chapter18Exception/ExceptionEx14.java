package Chapter18Exception;

public class ExceptionEx14 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
}
