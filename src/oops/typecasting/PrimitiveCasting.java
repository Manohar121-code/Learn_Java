package oops.typecasting;

public class PrimitiveCasting {
	//<-----------<------------<----narrowing
	//short - int - long - float - double
	//widening----------->---------->------->
	
	public static void main(String[] args) {
		int i = 10;
		long l = i;
		
		int i2 = (int) l;
		
		double d = 12.34;
		System.out.println(d);
		
		int i3 = (int) d;
		System.out.println(i3);
		
		int i4 = 10;
		double d2 = i4;
		System.out.println(d2);
	}
}
