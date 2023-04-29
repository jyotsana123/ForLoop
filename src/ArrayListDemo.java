import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Nishu");
		al.add("Neelu");
		al.add("Nisha");
		al.add("Suraj");
		al.add("Ram");
		System.out.println(al.indexOf("Ram"));
		
		Iterator<String> it = al.iterator();
		//System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("************************");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("************************");
		for(String a :al)
		{
			System.out.println(a);
		}
		
		System.out.println("************************");
		System.out.println(al.contains("Nishu"));
	}

}
