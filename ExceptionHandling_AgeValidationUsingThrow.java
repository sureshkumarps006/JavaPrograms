public class ExceptionHandling_AgeValidationUsingThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int age = 14;
			if(age<18) {
				throw new ArithmeticException();
			}
			else {
				System.out.println("Your eligible");
			}
			}
			catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e);
			}


	}

}
