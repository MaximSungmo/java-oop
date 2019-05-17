package exception;

public class ExceptionTest {

	public static void main(String[] args) {

		try {

			int a = 0;
			System.out.println("Some codes......");

			int k = 1000000 / a;
			System.out.println("More Codes.....1");
			System.out.println("More Codes.....2");

		} catch (Exception e) {
			//1. 로그 남기기 ... (파일로)
			System.out.println("Error: "+e);
			
			//2. 사과 
			System.out.println("죄송합니다. 예기치 못한 오류로 인하여 접속이 불가합니다.");
			
			//3. 정상종료
			return;
			
			//4. 1~3 이거라도 안되면 
			//e.printStackTrace();
			
		} finally {
			System.out.println("자원 정리");
		}
		

	}
}
