
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "learnjava";
		char b[] = a.toCharArray();
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			//System.out.println(b[i]);
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					System.out.println(b[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
