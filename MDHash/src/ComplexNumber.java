
public class ComplexNumber {

	private double real;
	private double imaginary;

	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public ComplexNumber() {

	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void add(double real, double imaginary) {

		this.real += real;
		this.imaginary += imaginary;

	}

	public void add(ComplexNumber c) {

		this.real += c.real;
		this.imaginary += c.imaginary;

	}

	public void substract(double real, double imaginary) {

		this.real -= real;
		this.imaginary -= imaginary;

	}

	public void substract(ComplexNumber c) {

		this.real -= c.real;
		this.imaginary -= c.imaginary;

	}
}
