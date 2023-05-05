
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "nishu";
		String t = "";
		for (int i=a.length()-1;i>=0;i--)
		{
			t = t+a.charAt(i);
		}
		System.out.println(t);
		if(t.equals(a))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append("Jyotsana");
		sb.reverse();
		System.out.println(sb);
	}
	
	

}
