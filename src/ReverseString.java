
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Nishu";
		String temp = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			temp = temp+s.charAt(i);
		}
		
		System.out.println(temp);
	}

}
