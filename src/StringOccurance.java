import java.util.*;
public class StringOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
	      char[] a =  s.toCharArray();
	      HashMap<Character, Integer> hm = new HashMap<>();
	      for(char c : a)
	     {
	if(hm.containsKey(c))
	{
	       hm.put(c, hm.get(c)+1);
	}
	else
	{
	hm.put(c,1);
	}
	}
	for(Map.Entry<Character, Integer> set : hm.entrySet())
	{
		System.out.println(set.getKey()+  " = "+set.getValue());
	}
	
	for(Map.Entry<Character, Integer> set : hm.entrySet())
	{
		if(set.getValue()>1)
		{
		System.out.println("Duplicate character is : " + set.getKey()+  " = "+set.getValue());
		}
	}
	
	}

}
