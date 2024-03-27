package studio7;

public class FRACTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int numerator;	
	private int denominator;
	private int numerator2;	
	private int denominator2;

	public FRACTION (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public int Add () {
		if (denominator == denominator2) {
			return (numerator + numerator2);
		}
		else {
			return((denominator2*numerator) + (denominator*numerator2));
		}
	}
	public String Multiply () {
		return ((numerator*numerator2) + "/" + (denominator*denominator2));
		}
	public String Recip() {
		int M = numerator;
		int N = denominator;
		return (N + "/" + M);
	}
	public String Simply() {
		for( int i =  1; i>0; i++) {
		if (numerator%i ==0 && denominator%i == 0) {
			return(numerator/i + "/" + denominator/i);
		}
		}
	}
}
