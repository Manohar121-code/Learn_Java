package string;

public class Sample {
	public static void main(String[] args) {
		String s = "java";
		System.out.println("length - "+s.length());
		System.out.println("character at 2nd index - "+s.charAt(2));
		System.out.println("first index of 'a' - "+s.indexOf('a'));
		System.out.println("after 2nd index of 'a' - "+s.indexOf('a', 2));
		System.out.println("last index of 'a' - "+s.lastIndexOf('a'));
		
		System.out.println(s.toUpperCase());
		System.out.println("TEST".toLowerCase());
		System.out.println(s + "test");
		
		String s2 = "once upon a time a king was there";
		String substring = s2.substring(5);
		System.out.println(substring);
		
		String substring2 = s2.substring(5, 15);
		System.out.println(substring2);
		
		System.out.println(substring2.toUpperCase());
	}
}
