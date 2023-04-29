import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(2, "Hello");
		hm.put(4, "Morning");
		Set<Entry<Integer, String>> entry = hm.entrySet();
		Iterator<Entry<Integer, String>> it = entry.iterator();
		while(it.hasNext())
		{
		Map.Entry mentry = (Map.Entry)it.next();
			System.out.print(mentry.getKey());
			System.out.println(mentry.getValue());
		}
		
//		for(Map.Entry<Integer,String> s : hm.entrySet())
//		{
//			System.out.print(s.getKey());
//			System.out.println(s.getValue());
//		}
	}

}
