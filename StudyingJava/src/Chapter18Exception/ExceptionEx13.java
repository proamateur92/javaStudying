package Chapter18Exception;

public class ExceptionEx13 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		} catch(Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
}
