
public class StringPalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Shree";
		String t = "";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			t = t+s.charAt(i);
			
		}
		if(t.equals(s))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	
	}

}
