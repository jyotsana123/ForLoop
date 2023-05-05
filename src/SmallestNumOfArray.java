
public class SmallestNumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print smallest no. of array
		int a[] = {6,3,2,1,7,3,5,0,9};
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<a[0])
			{
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
