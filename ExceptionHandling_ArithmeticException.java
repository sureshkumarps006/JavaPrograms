public class ExceptionHandling_ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Statement1");
		System.out.println("Statement2");
		System.out.println("Statement3");
		try {
			int i=0;
			
			int result = 10/i;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("Statement4");
		System.out.println("Statement5");
	}

}
