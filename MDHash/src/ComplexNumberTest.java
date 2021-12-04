
public class ComplexNumberTest {
	public static void main(String args[]) {

		ComplexNumber c1 = new ComplexNumber(1, 2);
		ComplexNumber c2 = new ComplexNumber(1, 2);

		c1.add(1, 2);
		
		System.out.println(c1.getReal());
		System.out.println(c1.getImaginary());
	}
}
