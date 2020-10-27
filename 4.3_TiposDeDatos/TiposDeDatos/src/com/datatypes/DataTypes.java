package com.datatypes;

public class DataTypes {
	public static void main(String[] args) {
		// Tipos de variables disponibles en Java
		boolean result = true;
		char capitalC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 100000;
		long total=999999999;
		long ss_num = 999_99_9999;
		double d1 = 123.4;
		double d2 = 1.234e2;
		float f1 = 123.4f;
		
		double x = 3.25;
		double y = -4.5;
		int m = 23;
		int n = 9;
		System.out.println(x + m * y - (y + n) * x);	//Las operaciones se pueden realizar dentro de la sentencia print
		System.out.println(m / n + m % n);				// (/) Divicion (%) Modulo de divicion
		System.out.println(5 * x - n / 5);				// (*) Multiplicacion
		System.out.println(Math.sqrt(Math.sqrt(n)));
		System.out.println((int)x);
		System.out.println(Math.round(y));
		x = 3.25;
		y = -4.5;
		m = 23;
		n = 9;
		System.out.println((int)Math.round(x) + (int)Math.round(y));	//Conversion Double a int
		System.out.println(m + n);
		System.out.println(1-1-((1-(1-(1-n)))));
	}
}
