package array;

public class Sample {
	public static void main(String[] args) {
		int[] arr = new int[6];
		//set values in array
		int val = 10;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = val;
			val += 10;
		}
		
		//print
		int j;
		for (int i = 0; i < arr.length; i++) {
			j = arr[i];
			System.out.println(j);
		}
		System.out.println("-----------------------");
		String[] arrStr = new String[3];
		arrStr[0] = "test1";
		arrStr[1] = "test2";
		arrStr[2] = "test3";
		
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		System.out.println("-----------------------");
		Person[] arrPerson = new Person[3];
		arrPerson[0] = new Person();
		arrPerson[1] = new Person(10, "India");
		arrPerson[2] = new Person();
		
		for (int i = 0; i < arrPerson.length; i++) {
			System.out.println(arrPerson[i]);
		}
		System.out.println("-----------------------");
		char[] arrChar = new char[3];
		arrChar[0] = 'a';
		arrChar[1] = 'b';
		arrChar[2] = 'c';
		
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println(arrChar[i]);
		}
		
		//-----------------------------------------------
		Object[] arrObj = new Object[5];
		arrObj[0] = 10;
		arrObj[1] = "java";
	}
}
