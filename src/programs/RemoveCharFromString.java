package programs;

public class RemoveCharFromString {
	public static void main(String[] args) {
		String s = "tirupat"; //trupati
		char ch = 'i';
		while (s.indexOf(ch) != -1) {
			s = removeChar(s, ch);
		}
		System.out.println(s);
	}

	private static String removeChar(String s, char ch) {
		int index = s.indexOf(ch);
		if (index < 0) {
			return s;
		}
		String firstStr = s.substring(0, index);
		String secondStr = s.substring(index + 1);
		String res = firstStr + secondStr;
		return res;
	}
	
	private static String removeCharByRecursion(String s, char ch) {
		int index = s.indexOf(ch);
		if (index < 0) {
			return s;
		}
		String firstStr = s.substring(0, index);
		String secondStr = s.substring(index + 1);
		String res = firstStr + secondStr;
		return removeChar(res, ch);
	}
}
