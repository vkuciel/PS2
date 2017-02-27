// Victor Kuciel
package base;

public class MyInteger {
	public int ivalue;
	private MyInteger value;

	public static void main(String[] args) {
	}
	
	public MyInteger(int value) {
		ivalue = value;
	}
	
	public int get() {
		return ivalue;
	}
	
	public boolean isEven() {
		return isEven(ivalue);
	}
	
	public boolean isOdd() {
		return isOdd(ivalue);
	}
	
	public boolean isPrime() {
		return isPrime(ivalue);
	}
	
	public boolean isEven(MyInteger val) {
		return isEven(val.value);
	}
	
	public boolean isOdd(MyInteger val) {
		return isOdd(val.value);
	}
	
	public boolean isPrime(MyInteger val) {
		return isPrime(val.value);
	}
	
	public boolean equals(int val) {
		if (val == ivalue)
			return true;
		return false;
	}
	
	public boolean equals(MyInteger val) {
		if (val.ivalue == ivalue)
			return true;
		return false;
	}
	
	public static int parseInt(char[] val) {
		return Integer.parseInt(new String(val));
	}
	
	public static int parseInt(String val) {
		return Integer.parseInt(new String(val));
	}
	
	private static boolean isEven(int val) {
		if ((val%2) == 0)
			return true;
		return false;
	}
	private static boolean isOdd(int val) {
		if ((val%2) != 0)
			return true;
		return false;
	}
	private static boolean isPrime(int val) {
	    if (isEven(val)) return false;
	    for (int i=3; i*i<=val; i+=2) {
	        if ((val%i) == 0)
	            return false;
	    }
	    return true;

	}

}
