
public class TestSimpleCalculator {

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		sc.setFirstNumber(10);
		sc.setSecondNumber(0);
		System.out.println("Addition result-> " + sc.getAdditionResult());
		System.out.println("Subtraction result-> " + sc.getSubtractionResult());
		System.out.println("Multiplication result-> " + sc.getMultiplicationResult());
		System.out.println("Division result-> " + sc.getDivisionResult());
	}

}
