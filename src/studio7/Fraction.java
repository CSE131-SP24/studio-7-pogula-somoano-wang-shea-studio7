package studio7;

public class Fraction {
	private int num;
	private int denom;
	
	public Fraction(int initN, int initD) {
		num = initN;
		denom = initD;
	}
	
	public String add(int n1, int n2, int d1, int d2) {
		int newD = d1 * d2;
		int newN1 = d2 * n1;
		int newN2 = d1 *n2;
		int newN = newN1+newN2;
		return newN + "/" + newD;
	}
	
	public String multiply(int n1, int n2, int d1, int d2) {
		int newN = n1*n2;
		int newD = d1*d2;
		return newN + "/" + newD;
	}
	
	public String recip(int n1, int d1) {
		int newD = n1;
		int newN = d1;
		return newN + "/" + newD;
	}
	
	public String simplify(int n1, int d1) {
		int gcd = gcd(n1, d1);
		int newN = n1/gcd;
		int newD = d1/gcd;
		
		return newN + "/" + newD;
		
	}
	public int gcd(int p, int q) {
		if(p%q ==0) {
			return q;
		}
		else {
			return gcd(p,p%q);
		}
	}
	
	
	

}
