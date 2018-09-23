package model;

public class KaratsubaMultipliation {

	public long karatsubaMul(long number1, long number2) {

		if (number1 < 10 || number2 < 10) {
			return number1 * number2;
		}

		String n1 = String.valueOf(number1);
		String n2 = String.valueOf(number2);

		int lengthNumber1 = n1.length();
		int lengthNumber2 = n2.length();

		int lengthMax = Math.max(lengthNumber1, lengthNumber2)/2;

		int mitad = lengthNumber1-lengthMax;
		int mitad2 = lengthNumber2-lengthMax;
		
		long a = Long.valueOf((n1.substring(0, mitad)));
		long b = Long.valueOf((n1.substring(mitad)));
		long c = Long.valueOf((n2.substring(0,mitad2)));
		long d = Long.valueOf((n2.substring(mitad2)));

		long z1 = karatsubaMul(a, c);
		long z2 = karatsubaMul(b, d);
		long z3 = karatsubaMul((a + b), (c + d));

		return (long) (z1 * Math.pow(10, lengthMax*2)) + (long)((z3-z2-z1)*Math.pow(10,(lengthMax/2))  +  (z2));
	}
}
