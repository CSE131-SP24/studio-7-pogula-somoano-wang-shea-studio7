package studio7;

public class Complex {
	private double real;
	private double imag;
	
	public Complex(double initR, double initI) {
		real = initR;
		imag = initI;
	}
	
	public String add(double r1, double i1, double r2, double i2) {
		double r = r1+r2;
		double i = i1+i2;
		return r + " + " + i +"i";
	}
	
	public String multiply(double r1, double i1, double r2, double i2) {
		double r = (r1*r2)-(i1*i2);
		double i = (r1*i2)-(r2*i1);
		return r + " + " + i +"i";
	}
	
	
	

}
