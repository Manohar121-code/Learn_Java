package oops;

public class Sample {
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj = null;
		System.gc();
		Runtime.getRuntime().gc();
		Sample sample;
		sample = new Sample();
	}
}
