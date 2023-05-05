
public class StringConcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hello";
		String b = "World";
		System.out.println(a.concat("world"));
		System.out.println(a+"world");
		System.out.println(a.concat(b));
		System.out.println(a+b);
		
		System.out.println("*******************************");
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.append("world"));
		System.out.println(sb.append("health"));
	}

}
