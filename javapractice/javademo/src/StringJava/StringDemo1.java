package StringJava;

public class StringDemo1 {
	public static void main(String[] args) {
		
		String s="This is a String ";
				String s1=new String("This is a String ");
						String s2=new String();
						char[] ch = {'a','c','d','e','f'};
						String s3=new String(ch);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("first occurance from "+s1.indexOf('i'));
		System.out.println("last occurance from "+s1.lastIndexOf('i'));
		System.out.println("s1 to uppercase "+s1.toUpperCase());
		System.out.println("s1 to Lowercase "+s1.toLowerCase());
		System.out.println("string compare "+s1.compareTo(s));
		//read from keyboard
	
		
		

	}
}
